package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//use ssesion object to save java object
			System.out.println("Creating a new student object");
			//create a student object
			Student tempStudent = new Student("daffy", "duck", "daffy@love2code.com");
			
			//start a transaction
			session.beginTransaction();			
			
			//save the student object
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			// Find out the student's id: primmary key
			System.out.println("\n Saved student id: " + tempStudent.getId());
			
			
			// get a new seesion and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on the id: primary key
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent);
			
			// commit the transaction
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}

}
