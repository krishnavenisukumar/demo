package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteABook {
	public static void main(String[] args) {
		 SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.getTransaction();
		 try {
			 tx.begin();
			 Book book=(Book) session.get(Book.class, 1);
			 if(book!=null)
				 session.delete(book);
			 System.out.println("book is deleted");
			 
			 
			 
			 tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();


		}
		 session.close();
		 factory.close();
	}

}
