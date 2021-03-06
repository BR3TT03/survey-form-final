package org.timsina.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.timsina.main.model.Answer;
import org.timsina.main.model.Question;
import org.timsina.main.model.Surveys;
import org.timsina.main.model.SurveyAnswer;
import org.timsina.main.service.QuestionAnswerService;
import org.timsina.main.service.SurveyAnswerService;
import org.timsina.main.util.Formatter;

@Controller
@RequestMapping("/")
public class FormController {

	@Autowired
	QuestionAnswerService questionAnswer;

	@Autowired
	SurveyAnswerService surveyService;

	@GetMapping
	public String getSurveyFormView() {
		return "Survey";
	}
	@GetMapping("/getAll")
	@ResponseBody public Iterable<Question> showForm() {
		return questionAnswer.getAll();

		// return questionAnswer.setAnswer(1, answer);
	}

	@GetMapping("/survey")
	@ResponseBody public Object getAllSurveyResult() {
	
		return surveyService.getAllSurveyResult();
	}
	@Autowired
	Formatter format;
	@PostMapping("/survey")
	@ResponseBody public Object saveUserSurveyAnswer(@RequestBody String surveyAnswers) {
		//return surveyAnswers;
		return format.formatter(surveyAnswers);
		//return surveyService.saveUserSurveyAnswer(surveyAnswers);
		
	}
	@GetMapping("/questionSavePage")
	public String questionAnswersSavePage() {
		return "addData";
	}
	
	@PostMapping("/saveQuestionAnswers")
	@ResponseBody public Object saveQuestionAnswers(@RequestBody String questionAnswers) { 
		//return questionAnswers;
		// format.questionAnswerFormatter(questionAnswers);
		Question question=(Question) format.questionAnswerFormatter(questionAnswers);
		//return question;
		return questionAnswer.saveQuestionAnswers(question);
		
		
	}
	

}
