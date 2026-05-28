package Day29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employees3")
public class emp {
	
	public emp()
	{
		
	}
	public emp(String name, double salary)
	{
		this.emp_name = name;
		this.salary = salary;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	@NotNull(message = "name cannot be null")
	@Size(min=3,max=20)
	
	private String emp_name;
	@Min(20000)
	@Max(10000)
	private double salary;
	
	@ElementCollection
	private List<String> emails;
	
	@ElementCollection
	private Set<String> skills = new HashSet<>();
	
	@ElementCollection
	private Map<Integer,String> projects = new HashMap<>();

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<Integer, String> getProjects() {
		return projects;
	}

	public void setProjects(Map<Integer, String> projects) {
		this.projects = projects;
	}
	
	
	

}