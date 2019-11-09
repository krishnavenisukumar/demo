package com.demo.compositekey2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) throws ParseException {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session1=factory.openSession();
		Transaction tx=session1.getTransaction();
		
		Customer customer1=(Customer) session1.get(Customer.class, 1);
		customer1.setAddress("Bangalore");
		session1.close();
		
		Session session2=factory.openSession();
		session2.getTransaction().begin();
		Customer customer2=(Customer) session2.get(Customer.class, 1);
		customer2.setAddress("pqrs");
		session2.merge(customer1);
		session2.getTransaction().commit();
		
		factory.close();


	}
	

}
