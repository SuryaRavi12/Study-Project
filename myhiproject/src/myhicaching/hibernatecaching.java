package myhicaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernatecaching {

  public static void main(String[] args) {
      SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
       
     Student student = (Student) session.get(Student.class, 104);
     System.out.println(student);
     //Once again get the same id.
     Student student1 = (Student) session.get(Student.class, 101);
     System.out.println(student1);
     session.close();
  }
}