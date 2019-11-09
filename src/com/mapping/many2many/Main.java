package com.mapping.many2many;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) throws ParseException {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		session1.getTransaction().begin();
		
		/*List<Emp>emps=session1.createQuery
				("from Emp e join fetch e.parking Parkingmp").list();
		for(Emp e:emps)
			System.out.println(e.getName()+":"+e.getParking().getLoc());*/
		
		
		

		Emp emp1=new Emp();
		emp1.setName("raja");
		

		Emp emp2=new Emp();
		emp2.setName("mani");
		
		
		
		
		Project p1=new Project();
		p1.setName("Fresher HR Training");
		p1.setPmgr("leena");
		
		Project p2=new Project();
		p2.setName("Batch3 HR Training");
		p2.setPmgr("Asha");
		
		emp1.getProjects().add(p1);
		p1.getEmps().add(emp1);
		
		emp1.getProjects().add(p2);
		p2.getEmps().add(emp1);
		
		
		emp2.getProjects().add(p1);
		p1.getEmps().add(emp2);
		
		emp2.getProjects().add(p2);
		p2.getEmps().add(emp2);
		
		
		
		
		
		
		session1.save(emp1);
		
		
		session1.save(emp2);

		
		
		session1.save(p1);

		
		
		session1.save(p2);


		session1.getTransaction().commit();
		session1.close();
		factory.close();

	}

}
