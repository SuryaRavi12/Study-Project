package myhihcql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class hcql {
  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      session.beginTransaction();
	
	try {
		Criteria c = session.createCriteria(Student.class);
		//for (int i = 0; i < args.length; i++) {
			c.add(Restrictions.eq("id",101));
			List<Student> results = c.list();
		 }
		catch (Exception e) {
			System.out.println("the error");
		}
	}
  }


		/*Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.eq("name","vamana"));
		List<Student> results1 = c1.list();
		//Students marks between to 30 & 40 
		Criteria c2 = session.createCriteria(Student.class);
		c2.add(Restrictions.eq("Gender","male")); 
		List<Student> results2 = c2.list();
		*/

  