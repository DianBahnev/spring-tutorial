package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			//start a transaction
			session.beginTransaction();			
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			//display the students
			displayStudents(theStudents);
			
			//query students: lastName="Doe"
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").list();
			
			System.out.println("\nStudents that have last name Doe");
			displayStudents(theStudents);
			
			//query students: lastName="Doe" or first name paul2
			theStudents = session.createQuery("from Student s where"
					+ " s.lastName='Doe' OR s.firstName='paul2'").list();
			
			System.out.println("\nStudents that have last name Doe or first name paul2");
			displayStudents(theStudents);
			
			//query students where eimail LIKE '%luv2code.com'
			theStudents = session.createQuery("from Student s where"
					+ " s.email LIKE '%love2code.com'").list();
			System.out.println("\nStudents where email LIKE '%love2code.com'");
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
