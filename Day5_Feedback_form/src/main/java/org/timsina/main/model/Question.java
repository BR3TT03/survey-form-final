package org.timsina.main.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = -7301385062803077627L;
		@GeneratedValue
		@Id
		private int qId;
		private String qName;
		private String qDescription;
		private String qRemarks;
		private String aType;
		@OneToMany(mappedBy = "question")
		private List<Answer> answer =new ArrayList<>();
		
		public Question() {
		//s	super();
			// TODO Auto-generated constructor stub
		}

		public Question(int qId, String qName, String qDescription, String qRemarks, String aType,
				List<Answer> answer) {
			super();
			this.qId = qId;
			this.qName = qName;
			this.qDescription = qDescription;
			this.qRemarks = qRemarks;
			this.aType = aType;
			this.answer = answer;
		}

		public int getqId() {
			return qId;
		}

		public void setqId(int qId) {
			this.qId = qId;
		}

		public String getqName() {
			return qName;
		}

		public void setqName(String qName) {
			this.qName = qName;
		}

		public String getqDescription() {
			return qDescription;
		}

		public void setqDescription(String qDescription) {
			this.qDescription = qDescription;
		}

		public String getqRemarks() {
			return qRemarks;
		}

		public void setqRemarks(String qRemarks) {
			this.qRemarks = qRemarks;
		}

		public String getaType() {
			return aType;
		}

		public void setaType(String aType) {
			this.aType = aType;
		}

		public List<Answer> getAnswer() {
			return answer;
		}

		public void setAnswer(List<Answer> answer) {
			this.answer = answer;
		}
		
		
		
}
