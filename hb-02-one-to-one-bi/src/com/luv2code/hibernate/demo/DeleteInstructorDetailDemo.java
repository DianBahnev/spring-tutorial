package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();			
			
			int theInd = 2;
			InstructorDetail tempInstructorDetail =
					session.get(InstructorDetail.class, theInd);
			
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
			
			System.out.println("the assosicated instructor: " + tempInstructorDetail.getInstructor());;
			
			// delete instrutor deatila
			
			session.delete(tempInstructorDetail);
			System.out.println("Deleting: " + tempInstructorDetail);
			
			// commit transaction
			session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
