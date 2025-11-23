package com.akshita.model;

public class Course {
	
	private int cId;
	private String cName;
	private String cDesp;
	private double cPrice;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDesp() {
		return cDesp;
	}
	public void setcDesp(String cDesp) {
		this.cDesp = cDesp;
	}
	public double getcPrice() {
		return cPrice;
	}
	public void setcPrice(double cPrice) {
		this.cPrice = cPrice;
	}
	public Course(int cId, String cName, String cDesp, double cPrice) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cDesp = cDesp;
		this.cPrice = cPrice;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cDesp=" + cDesp + ", cPrice=" + cPrice + "]";
	}
	
	


}
