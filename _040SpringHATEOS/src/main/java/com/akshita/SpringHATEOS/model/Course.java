package com.akshita.SpringHATEOS.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel{

	
	private int cid;
	private String cname;
	private Double cprice;
	
	public Course() {
		super();
	}

	public Course(int cid, String cname, Double cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCprice() {
		return cprice;
	}

	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
	

}
