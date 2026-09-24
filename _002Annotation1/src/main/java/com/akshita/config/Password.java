package com.akshita.config;

public class Password {
	
	private String algo;
	
	public Password(String algorithm) {
		System.out.println("Password obj created");
		this.algo=algorithm;
	}
	
	public String getAlgo() {
		return algo;
	}
	
	
}
