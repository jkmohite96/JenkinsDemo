package com.L2CDemoMVN;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestL2C {

public static void main(String[] args) {
		
	
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session sessionOne =sf.openSession();
		Transaction tx = sessionOne.beginTransaction();
		
		/*
		Employee emp1 = new Employee("AAA",20000);
		Employee emp2 = new Employee("BBB",50000);
		
		tx.commit();
		sessionOne.close();
		*/
		
		
		Employee emp = (Employee)sessionOne.load(Employee.class, 2);
		 System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		 tx.commit();
		 sessionOne.close();		 
		 
		 Session sessiontwo = sf.openSession();
		 tx = sessiontwo.beginTransaction();
		 
		 Employee emp1 = (Employee) sessiontwo.load(Employee.class, 2);
		 System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());
		 
		 tx.commit();
		 sessiontwo.close();
		 
}
	
	
}
