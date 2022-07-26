package com.jpa.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.student.dao.StudentManagementRepository;
import com.jpa.student.entities.Students;

@Service
public class StudentManagementService
{
	@Autowired
	private StudentManagementRepository studentRepository;
	
	public Students createStudent(Students student)
	{
		return studentRepository.save(student);
	}
	
	public Iterable<Students> createStudents(List<Students> studentList)
	{
	    Iterable<Students> studentlists = studentRepository.saveAll(studentList);
	    
	    return studentlists;
	}
	
	public Iterable<Students> getStudentsById(List<Integer> id) 
	{
		return studentRepository.findAllById(id);
	}
	
	public void deleteStudentById(Students student)
	{
		 studentRepository.delete(student);
		
	}
	
	public void updateStudentEmailById(int id, String newEmail) 
	{
		
		Students student = studentRepository.findById(id);
		if(id == student.getId())
		{
			student.setEmail(newEmail);
		}
		studentRepository.save(student);
	}
	

}
