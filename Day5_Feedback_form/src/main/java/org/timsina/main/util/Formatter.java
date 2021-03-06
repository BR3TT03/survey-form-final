package org.timsina.main.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.timsina.main.model.SurveyAnswer;
import org.timsina.main.service.SurveyAnswerService;
import org.timsina.main.model.*;

@Configuration
public class Formatter {
	@Autowired
	SurveyAnswerService answerService;

	public Formatter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Object formatter(String formData) {

		if (formData.contains("&")) {

			String[] data = formData.split("&");
			for (int i = 0; i < data.length; i++) {
				String[] Values = data[i].split("=");
				// String[] Final = Values[0].split("c");

				SurveyAnswer answerGiven = new SurveyAnswer();
				answerGiven.setqId(Integer.parseInt(Values[0]));
				answerGiven.setaId(Integer.parseInt(Values[1]));
				answerService.saveUserSurveyAnswer(answerGiven);
				// return formData;

			}
		} else {
			SurveyAnswer answerGiven = new SurveyAnswer();
			String[] Values = formData.split("=");
			answerGiven.setqId(Integer.parseInt(Values[0]));
			answerGiven.setaId(Integer.parseInt(Values[1]));
			answerService.saveUserSurveyAnswer(answerGiven);
			// return Values;
		}
		return "Save Success";

	}

	public Object questionAnswerFormatter(String questionAnswers) {
		Question question= new Question();
		try {
			questionAnswers= URLDecoder.decode(questionAnswers, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
		
		
//	/*	
		
		if (questionAnswers.contains("&")) {
			
			String[] data = questionAnswers.split("&");
			for (int i = 0; i < data.length; i++) {
				
				// String[] Final = Values[0].split("c");
				
				 if (data[i].contains("question")) {
				 String[] Values = data[i].split("=");
				 
				  question.setqDescription(Values[1]);
				  } 

				 if (data[i].contains("radio")) {
				 String[] Values = data[i].split("=");
				  question.setaType(Values[1]);
				  } 

				 if (data[i].contains("answer")) {
				 String[] Values = data[i].split("=");
				 Answer answer=new Answer();
				 answer.setaDescription(Values[1]);
				  question.getAnswer().add(answer);
				  } 
				/// answerService.saveUserSurveyAnswer(answerGiven);
				 //return Values;

			}
			return question;
		}
		 String[] Values = questionAnswers.split("=");
		  question.setqDescription(Values[1]);
		return question;

	}
	
	//
		
	}
