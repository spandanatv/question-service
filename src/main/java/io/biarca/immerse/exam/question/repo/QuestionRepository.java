package io.biarca.immerse.exam.question.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.biarca.immerse.exam.question.model.Question;

/**
 * @author saikiran
 *
 */
@RepositoryRestResource(collectionResourceRel = "question", path = "question")
public interface QuestionRepository extends PagingAndSortingRepository<Question, UUID> {	
	
	List<Question> findByExamType(@Param("examType") String examType);

}
