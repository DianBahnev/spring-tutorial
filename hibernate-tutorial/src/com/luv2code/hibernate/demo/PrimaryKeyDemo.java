package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
					//create 3  student object
					Student tempStudent = new Student("paul", "wall", "paul@love2code.com");
					Student tempStudent1 = new Student("Jhon", "Doe", "jhon@love2code.com");
					Student tempStudent2 = new Student("paul2", "wall2", "paul2@love2code.com");
					
					//start a transaction
					session.beginTransaction();			
					
					//save the student object
					session.save(tempStudent);
					session.save(tempStudent1);
					session.save(tempStudent2);
					
					// commit transaction
					session.getTransaction().commit();
				}
				finally {
					factory.close();
				}

	}

}
