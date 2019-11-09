package com.mapping.oneZone;

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
			System.out.println(e.getName()+":"+e.getParking().getLoc());
		*/
		
		Emp emp=new Emp();
		emp.setName("veni");
		

		Emp emp1=new Emp();
		emp1.setName("raja");
		

		Emp emp2=new Emp();
		emp2.setName("mani");
		

		Emp emp3=new Emp();
		emp3.setName("krishna");
		
		Parking parking=new Parking();
		parking.setLoc("AA12");
		emp.setParking(parking);
		
		
		Parking parking1=new Parking();
		parking1.setLoc("AB12");
		emp1.setParking(parking1);
		
		Parking parking2=new Parking();
		parking2.setLoc("AD78");
		emp2.setParking(parking2);
		
		Parking parking3=new Parking();
		parking3.setLoc("AM65");
		emp3.setParking(parking3);
		
		session1.save(parking);
		session1.save(emp);
		
		session1.save(parking1);
		session1.save(emp1);

		
		session1.save(parking2);
		session1.save(emp2);

		
		session1.save(parking3);
		session1.save(emp3);


		session1.getTransaction().commit();
		session1.close();
		factory.close();

	}

}
