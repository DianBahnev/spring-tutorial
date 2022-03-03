package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

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
			
			//create the objects 
			Instructor tempInstructor = 
					new Instructor("Chad", "Darby", "darby@lub2code.com");
			
			InstructorDetail tempInstrucorDetail =
					new InstructorDetail(
							"http://ww.luv2code.com/youtube",
							"Luv 2 cod!!!");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstrucorDetail);
			
			
			
			//start a transaction
			session.beginTransaction();			
			
			//save the instructor
			// this willl also save the details because of casscade type.all
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
