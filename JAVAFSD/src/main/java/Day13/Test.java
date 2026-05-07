package Day13;

public class Test {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		
		try
		{
			Employee e1 = new Employee(1,"Balaji",5000, "DEVELOPER");
			Employee e2 = new Employee(2,"Gowthami", 2500, "SOC ANALYST");
			
			service.validateEmployee(e1);
			service.writeEMployee(e1);
			
			service.validateEmployee(e2);
			service.writeEMployee(e2);
		}
		catch(CustomEmployeeException e)
		{
			System.out.println("Validation error:" +e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("File error: "+e);
		}
		
		try
		{
			service.readEmployees();
		}
		catch(Exception e)
		{
			System.out.println("Read Error:"+e);
		}

	}

}