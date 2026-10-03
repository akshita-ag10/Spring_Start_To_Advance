package com.akshita.AuthenticateDBUsers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.akshita.AuthenticateDBUsers.model.Learner;

@Repository
public interface LearnerRepo extends JpaRepository<Learner, Long>{

	Learner findByUsername(String username);
}
