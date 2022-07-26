package com.jpa.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.student.entities.Students;
import com.jpa.student.service.StudentManagementService;

@SpringBootApplication
public class StudentManagementDataJpaApplication implements CommandLineRunner {

	@Autowired
	StudentManagementService studentService;
	 
	public static void main(String[] args) 
	{
		SpringApplication.run(StudentManagementDataJpaApplication.class, args);
	}
	
	public void run(String... args) throws Exception
	{
		//createStudent();
		//createStudents();
		//getStudentsById();
		//deleteStudentById();
		updateStudentEmailById();
	}
	private void createStudent()
	{
		Students student = new Students("riya","ingole","riya2022@gmail.com",new Date());
		Students studentinfo = studentService.createStudent(student);
		System.out.println(studentinfo);
	}
	private void createStudents()
	{
	 List<Students> studentList = Arrays.asList(new Students("shifali","dixit","shifali@gmail.com", new Date()),
			 new Students("Ravina","Kardekar","ravina@gmail.com",new Date()));
	 Iterable<Students> createStudents = studentService.createStudents(studentList);
	 for(Students student : createStudents)
	 {
		 System.out.println(student);
	 }
	 
	 
	}
	private void getStudentsById()
	{
		List<Integer> id=new ArrayList<>();
		id.add(1);
		id.add(2);
		id.add(5);
		
		Iterable<Students> studentList = studentService.getStudentsById(id);
		studentList.forEach(System.out::println);
		
	
	}
	private void deleteStudentById()
	{
		Students student = new Students();
		student.setId(3);
		studentService.deleteStudentById(student);
	}
	private void updateStudentEmailById()
	{
		studentService.updateStudentEmailById(2,"shifali12345@gmail.com");
	}
	

}
