package com.jpa.student.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.student.entities.Students;


public interface StudentManagementRepository extends CrudRepository<Students,Integer>
{

	Students findById(int id);

}
