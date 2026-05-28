package Day29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EntityManagerRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myunit");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		department d= new department();
		d.setDept_name("IT");
		//employee 1
		emp e1 = new emp();
		e1.setEmp_name("Balaji");
		e1.setSalary(50000);
		e1.setEmails(Arrays.asList("Balaji@gmail.com","Balaji@gmail.com"));
		Set<String> skillset = new HashSet<>();
		skillset.add("Python");
		skillset.add("java");
		skillset.add("Hibernate");
		skillset.add("Spring boot");
		e1.setSkills(skillset);
		
		Map<Integer,String> projectmap = new HashMap<>();
		projectmap.put(1, "Banking System");
		projectmap.put(2, "Ecommerce");
		projectmap.put(3, "Hospital management");
		e1.setProjects(projectmap);
		//Employee 2
		emp e2 = new emp();
		e2.setEmp_name("Gow");
		e2.setSalary(70000);
		e2.setEmails(Arrays.asList("Gow@gmail.com","Gow@gmail.com"));
		Set<String> skillset1 = new HashSet<>();
		skillset.add("HTML");
		skillset.add("CSS");
		skillset.add("React");
		
		e2.setSkills(skillset1);
		
		Map<Integer,String> projectmap1 = new HashMap<>();
		projectmap1.put(1,"College Management");
		projectmap1.put(2, "Payroll System");
		e2.setProjects(projectmap1);
		
		//Relationship
		e1.setDept(d);
		e2.setDept(d);
		
		d.setEmployees(Arrays.asList(e1,e2));
		
		em.persist(d);
		tx.commit();
		
		System.out.println("Department and Employees inserted");
		
		//Fetch employee
		emp e = em.find(emp.class,1);
		
		if(e!=null)
		{
			System.out.println("Employee name:"+e.getEmp_name());
			
			System.out.println("Employee id:"+e.getEmp_id());
			
			System.out.println("Employee Salary:"+e.getSalary());
			
			System.out.println("Department: " +e.getDept().getDept_name());

		}
        em.close();
		emf.close();
	}
}