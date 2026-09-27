package com.akshita.entity;

import jakarta.persistence.*;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String fname;
	private String lname;
	private String city="Delhi";
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", city=" + city + "]";
	}
	public Customer(String fname, String lname, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int id) {
		this.cid = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
