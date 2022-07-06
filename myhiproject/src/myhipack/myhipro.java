package myhipack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class myhipro
{

	public static void main(String[] args) 
	{
		Student Stu=new Student();
		Stu.setId(101);
		Stu.setName("Surya Ravi");
		Stu.setGender("male");
		
		Student Stu1=new Student();
		Stu1.setId(102);
		Stu1.setName("Naveen");
		Stu1.setGender("male");
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sfactory=con.buildSessionFactory();
		Session session=sfactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(Stu);
		session.save(Stu1);
		trans.commit();
		session.close();
	}

}
