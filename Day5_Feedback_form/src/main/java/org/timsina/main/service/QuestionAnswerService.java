package org.timsina.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.timsina.main.model.Answer;
import org.timsina.main.model.Question;
import org.timsina.main.model.Surveys;
import org.timsina.main.repository.AnswerRepository;
import org.timsina.main.repository.QuestionRepository;
import org.timsina.main.repository.SurveysAnswerRepository;
import org.timsina.main.repository.SurveysRepository;

@Service
public class QuestionAnswerService {

	public QuestionAnswerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	QuestionRepository questionRepo;
	@Autowired
	AnswerRepository answerRepo;

	public Iterable<Question> getAll() {

		Iterable<Question> question = questionRepo.findAll();
		return question;

	}
	public Object saveQuestionAnswers(Question questionAnswer) {
		questionRepo.save(questionAnswer);
		
		//answerRepo.save(questionAnswer.getAnswer());
		for(Answer answer:questionAnswer.getAnswer()) {
			answer.setQuestion(questionAnswer);
			answerRepo.save(answer);
		}
		//return null;
		return "Save Success!!!";
	}

}
