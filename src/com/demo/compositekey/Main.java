package com.demo.compositekey;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			Customer customer=new Customer(191, "15ec98", "abcd", "988665656");
			session.save(customer);
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		}
		session.close();
		factory.close();
		}

}
