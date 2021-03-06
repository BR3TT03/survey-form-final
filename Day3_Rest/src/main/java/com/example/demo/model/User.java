/**
 * @author Umesh Bhujel <yoomesbhujel@gmail.com>
 * Since Sep 24, 2019
 */
package com.example.demo.model;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -6760987381047658382L;
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
