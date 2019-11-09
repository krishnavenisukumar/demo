package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		//Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			Book book = new Book("A1567", "Effective C", "def", 750);
			session.save(book);
			System.out.println("object is saved");
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();

		}
		//session.close();
		factory.close();

	}
}
