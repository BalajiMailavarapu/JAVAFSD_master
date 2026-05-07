package Day15;

public class Employee {

	int empid;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	
	public Employee(int empid, String name, double salary, String designation, String insuranceScheme)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	public String getInsuranceScheme()
	{
		return insuranceScheme;
	}
	
	public int getEmpId()
	{
		return empid;
	}
	
	public String toString()
	{
		return "ID:" + empid + ",Name:" + name + ", Salary:" + salary + ",Designation: " +designation + ",Scheme:  " + insuranceScheme;
	}
}