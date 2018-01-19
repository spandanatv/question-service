package io.biarca.immerse.exam.question.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

/**
 * @author saikiran
 *
 */
@Entity
@Component
public class Question {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Type(type = "uuid-char")
	private UUID uuid;
	private String examType;
	
	@Lob
	private String questions;

	public Question() {
		
	}
	public Question(UUID uuid, String examType, String questions) {
		this.uuid = uuid;
		this.examType = examType;
		this.questions = questions;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Question [uuid=" + uuid + ", examType=" + examType + ", questions=" + questions + "]";
	}

}
