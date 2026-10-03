package com.akshita.AuthenticateDBUsers.model;

import jakarta.persistence.*;

@Entity
@Table(name="learners")
public class Learner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String username;
	private String password;
	private int age;
	private String subject;
	private String country;
	
	
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Learner(String username, String password, int age, String subject, String country) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.subject = subject;
		this.country = country;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Learner [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", subject="
				+ subject + ", country=" + country + "]";
	}
	
	
	
	
	
	
}
