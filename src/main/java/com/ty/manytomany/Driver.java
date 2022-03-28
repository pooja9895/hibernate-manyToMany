package com.ty.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		// to insert values to database
		
//		et.begin();
//		List<Student> student=new ArrayList();
//		Student stu1=new Student(); // one student
//		stu1.setId(1);
//		stu1.setName("Mala");
//		stu1.setAge(21);
//		student.add(stu1);
		
		// multiple courses
//		List<Course> course=new ArrayList();
//		Course c1=new Course();
//		c1.setId(1);
//		c1.setName("Java");
//		c1.setDuration(3);
//		c1.setStudent(student);
//		course.add(c1);
//		
//		Course c2=new Course();
//		c2.setId(2);
//		c2.setName("Python");
//		c2.setDuration(5);
//		c2.setStudent(student);
//		course.add(c2);
//		
//		
//		Course c3=new Course();
//		c3.setId(3);
//		c3.setName("HTML");
//		c3.setDuration(2);
//		c3.setStudent(student);
//		course.add(c3);
//		
//		stu1.setCourse(course);
//		
//		Course c4=new Course();
//		c4.setId(4);
//		c4.setName("SQL");
//		c4.setDuration(4);
//		course.add(c4);
//		
//		Student stu2=new Student();
//		stu2.setId(2);
//		stu2.setName("Ram");
//		stu2.setAge(23);
//
//		
//		stu2.setCourse(course);
//		student.add(stu2);
//		Student stu3=new Student(); 
//		stu3.setId(3);
//		stu3.setName("Shaila");
//		stu3.setAge(24);
//		
//		stu3.setCourse(course);
//		student.add(stu3);
		
		
		// to search and display data from database 
		
		Student s=em.find(Student.class, 1);
		if (s != null) 
		{
			System.out.println("\n------------student---------------\n");
			System.out.println("student id  : "+s.getId());
			System.out.println("stduent name : "+s.getName());
			System.out.println("student : "+s.getAge());
			System.out.println("\n------------course---------------\n");
			System.out.println("student course : "+s.getCourse());
		}
		Course c=em.find(Course.class, 2);
		if(c!=null)
		{
			System.out.println("\n------------course---------------\n");
			System.out.println("course id : "+c.getId());
			System.out.println("course name  : "+c.getName());
			System.out.println("\n------------student---------------\n");
			System.out.println("Stduent details  : " +c.getStudent());
		}
//		
//		 em.persist(stu1);
//		 em.persist(stu2);
//		 em.persist(stu3);
//		 em.persist(c1);
//		 em.persist(c2);
//		 em.persist(c3);
//		 em.persist(c4);
//		 
//		 et.commit();
	}
}

