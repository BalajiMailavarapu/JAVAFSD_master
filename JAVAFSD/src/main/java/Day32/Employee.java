package Day32;

public class Employee {
	
	private Laptop laptop;


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void work()
	{
		laptop.compile();
		System.out.println("Employee is working");
	}
}