package com.akshita.repo;

import org.springframework.stereotype.Repository;

@Repository("repo")
public class RepoLayer {
	
	public RepoLayer() {
		System.out.println("RepoLayer bean created");
	}

}
