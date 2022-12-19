package com.hibernateDemo.Hibernate_Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Employee emp = new Employee();
       
       emp.seteId(104);
       emp.seteName("Harsham");
       emp.seteSal(22000.235f);
       emp.setCity("Kadapa");
       
       Employee emp1 = new Employee();
       emp1.seteId(106);
       emp1.seteName("riyan");
       emp1.seteSal(26000.0f);
       emp1.setCity("BlueMountRoads");
       
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
      
       SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.persist(emp1);
       System.out.println(emp1);
       tx.commit();
       session.close();
    }
}
