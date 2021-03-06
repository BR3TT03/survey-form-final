package org.timsina.main.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8392151882671990688L;
	@Id
	@GeneratedValue
	private int aId;
	private String aName;
	private String aDescription;
	@ManyToOne
	@JsonIgnore
	private Question question;

	public Answer() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int aId, String aName, String aDescription, Question question) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aDescription = aDescription;
		this.question = question;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaDescription() {
		return aDescription;
	}

	public void setaDescription(String aDescription) {
		this.aDescription = aDescription;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}


	

	
	

}
