package Day27;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees3")
public class employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String emp_name;
	private double salary;
	
	public employee()
	{
		
	}
	
	public employee(String name,double salary)
	{
		this.emp_name=name;
		this.salary=salary;
	}

	public int getemp_id()
	{
		return emp_id;
	}
	
	public void setemp_id(int emp_id)
	{
		this.emp_id = emp_id;
	}

	public String getemp_Name() {
		return emp_name;
	}

	public void setemp_Name(String name) {
		this.emp_name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}