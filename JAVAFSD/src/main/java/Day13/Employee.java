package Day13;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	double salary;
	private String designation;
	
	public Employee(int id,String name, double salary,String designation)
	{
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String toString()
	{
		return id+ "  " +name+ "  "+salary+ "  "+ designation;
	}

}