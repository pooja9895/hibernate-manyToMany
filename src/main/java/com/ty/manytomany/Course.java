package com.ty.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
		
	@Id
	private int id;
	private String name;
	private int duration;
	
	@ManyToMany
	@JoinTable(inverseJoinColumns = @JoinColumn(name = "student_id"), joinColumns = @JoinColumn(name="course_id"))
	List<Student> student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	public String toString()
	{
		return "Course name : "+name+" Course duration  : "+id+" Course duration : "+duration;
	}
}
