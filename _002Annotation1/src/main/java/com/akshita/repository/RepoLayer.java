package com.akshita.repository;

import org.springframework.stereotype.Repository;

@Repository("reop") //this is the id, if not specified here then spring will take camel-case of Class name as bean id
public class RepoLayer {
	public RepoLayer() {
		System.out.println("RepoLayer bean created");
	}
}
