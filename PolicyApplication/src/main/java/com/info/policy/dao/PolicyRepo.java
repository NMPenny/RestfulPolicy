package com.info.policy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.info.policy.model.Policy;

public interface PolicyRepo extends JpaRepository<Policy, Integer>
{
	
}
