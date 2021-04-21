package com.management.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.entities.EmployeeEntity;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeEntity, Integer> {

	public EmployeeEntity findByEmployeeId(int id);
}
