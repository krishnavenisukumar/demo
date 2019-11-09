package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConceptOfFirstLevelCache {
	public static void main(String[] args) {
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Book book = (Book) session.load(Book.class, 1);
		Book book2 = (Book) session.load(Book.class, 1);
		System.out.println(book.getAuthor());

		// Book book2=(Book)session.get(Book.class, 1);

		session.close();
		System.out.println(book2.getAuthor());
		factory.close();

	}

}
