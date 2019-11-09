package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class ShowAllBooks {
	public static void main(String[] args) {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		@SuppressWarnings("unchecked")
		List<Object[]> bookObj = session.
				createQuery("select b.title,b.price from Book b where b.price>:price or b.title=:title")
				.setDouble("price",600).setString("title", "Effective Java").list();
		for(Object[] obj:bookObj){
			System.out.println(obj[0]+":"+obj[1]);
		}
		session.close();
		factory.close();

	}

}