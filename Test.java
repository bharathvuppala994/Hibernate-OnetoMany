package com.siri.onetomany.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.siri.onetomany.model.College;
import com.siri.onetomany.model.Students;
import com.siri.onetomany.sessionfact.SessionFact;

public class Test {
	static SessionFactory factory = null;
	
	public static void main(String[] args) {
		factory = SessionFact.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		College collegedetails = new College();
		
		Students stud1 = new Students();
		stud1.setStudName("bharath");
		stud1.setCollegedetails(collegedetails);
		
		
		Students stud2 = new Students();
		stud2.setStudName("rahul");
		stud2.setCollegedetails(collegedetails);
		
		
		List<Students> list = new ArrayList<Students>();
		list.add(stud1);
		list.add(stud2);
		
		
		collegedetails.setCollegeName("Siri");
		collegedetails.setStudlist(list);
		
		session.saveOrUpdate(collegedetails);
		
		
		
		session.getTransaction().commit();
		//session.close();
		
		

	}

}
