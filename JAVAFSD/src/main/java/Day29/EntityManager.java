package Day29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public  class EntityManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myunit");
		jakarta.persistence.EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		emp e1 = new emp();
		e1.setEmp_name("Tanvi");
		e1.setSalary(50000);
		e1.setEmails(Arrays.asList("Tanvi1@gmail.com","Tanvi2@gmail.com"));
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
		
		em.persist(e1);
		tx.commit();
		
		System.out.println("Employee inserted");
		
		emp e = em.find(emp.class,1);
		
		if(e!=null)
		{
			System.out.println("Employee name:"+e.getEmp_name());
			
			System.out.println("Employee id:"+e.getEmp_id());
			
			System.out.println("Employee id:"+e.getSalary());
			
		}
        em.close();
		emf.close();
	}
}
