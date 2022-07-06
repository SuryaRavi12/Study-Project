package myhihql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      session.beginTransaction();
     
     /* Let's see the HQL query*/
      Query q=session.createQuery("from Student where gender='male'");
      List<Student> emList=q.list();
      for(Student s:emList)
      {
          System.out.println(s.getId()+"   "+s.getName()+"   "+s.getGender());
      }
      session.getTransaction().commit();
     // System.out.println("table craeted");

  }
}