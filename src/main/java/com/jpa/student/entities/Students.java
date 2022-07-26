package com.jpa.student.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="student_table")
@DynamicUpdate
public class Students
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	
	@Column(name="first_name" ,length=60,nullable=false)
	private String firstName;
	
	@Column(name="last_name", length=60,nullable=false)
	private String lastName;
	
	@Column(name="student_email_id",unique=true)
	private String email;
	
	@Column(name="student_creation_date")
	private Date creationDate;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String firstName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}
