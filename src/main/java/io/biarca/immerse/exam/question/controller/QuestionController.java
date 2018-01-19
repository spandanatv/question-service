package io.biarca.immerse.exam.question.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.biarca.immerse.exam.question.model.Question;
import io.biarca.immerse.exam.question.repo.QuestionRepository;

/**
 * @author saikiran
 *
 */
@RestController
public class QuestionController {

	@Autowired
	QuestionRepository questionRepository;

	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Post request to add questions
	 * 
	 * @param examType
	 * @param questions
	 */
	@RequestMapping(value = "/postQuestions", method = RequestMethod.POST)
	public void postQuestions(@RequestParam("examType") String examType, @RequestParam("questions") String questions)
			{

		logger.info("posting questions for exam  :" + examType);

		// set examType and questions
		Question question = new Question();
		question.setExamType(examType);
		question.setQuestions(questions);

		// saving question object
		questionRepository.save(question);
	}

	/**
	 * Get request to get questions
	 * 
	 * @param examType
	 * @return
	 */
	@RequestMapping(value = "/getQuestions", method = RequestMethod.GET)
	public List<Question> getQuestions(@RequestParam(value = "examType") String examType) {
		logger.info("fetching questions for exam  :" + examType);

		// fetching questions based on exam type
		List<Question> questionsList = questionRepository.findByExamType(examType);
		return questionsList;
	}
}
