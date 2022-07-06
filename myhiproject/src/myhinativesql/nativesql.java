package myhinativesql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class nativesql {
  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      session.beginTransaction();
     
     /* Let's see the SQL NATIVE query*/
      Query q=session.createSQLQuery("SELECT * from Student");
      List<Student[]> list=q.list();
      for(Object[] s:list)
      {
        System.out.println(s[0]+ " " +s[1]+ " "+s[2]);
     } 
      session.getTransaction().commit();
     // System.out.println("table craeted");
  }
}