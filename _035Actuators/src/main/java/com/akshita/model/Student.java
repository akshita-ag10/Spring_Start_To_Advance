package com.akshita.model;

public class Student {
	
	private int sId;
	private String sName;
	private String sCity;
	private int sAge;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int sId, String sName, String sCity, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
		this.sAge = sAge;
	}


	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + ", sAge=" + sAge + "]";
	}
	
	
	

}
