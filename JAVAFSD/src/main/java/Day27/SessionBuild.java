package Day27;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionBuild {
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		employee emp = new employee();
		emp.setemp_Name("Balaji");
		emp.setSalary(5000000);
		session.persist(emp);
		
		System.out.println("Employee inserted");
		
		employee e = session.get(employee.class,1);
		
		if(e!=null)
		{
			System.out.println("Employee name:"+e.getemp_Name());
			System.out.println("Employee id:" +e.getSalary());
			System.out.println("Employee name:"+e.getemp_id());
		}
		session.close();
		factory.close();
	}
}
