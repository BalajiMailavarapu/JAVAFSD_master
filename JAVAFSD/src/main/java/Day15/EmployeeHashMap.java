package Day15;
import java.util.* ;

public class EmployeeHashMap {
	static HashMap<Integer, Employee> empMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void addEmployee()
	{
		System.out.println("Enter employee ID:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter designation:");
		String designation  = sc.nextLine();
		
		System.out.println("Enter Insurance Scheme:");
		String scheme = sc.nextLine();
		
		Employee emp = new Employee(id, name, salary, designation, scheme);
		empMap.put(id,emp);
		
	}
	public static void displayByScheme()
	{
		System.out.println("Enter Insurance Scheme:");
		String scheme = sc.nextLine();
		
		boolean found = false;
		
		for(Employee emp: empMap.values())
		{
			if(emp.getInsuranceScheme().equalsIgnoreCase(scheme))
					{
				System.out.println(emp);
				found = true;
					}
			if(!found)
			{
				System.out.println("No employees found under this scheme:");
			}
		}
	}
		
		public static void deleteEmployee()
		{
			System.out.println("Enter employee ID to delete:");
			int id = sc.nextInt();
			
			if(empMap.containsKey(id))
			{
				empMap.remove(id);
				System.out.println("Employee removed successfully:");
			}
			else
			{
				System.out.println("Employee not found");
			}
		}
		
		public static void main(String[] args)
		{
			int choice;
			
			do
			{
				System.out.println("\n              Employee management\n");
				System.out.println("1.Add employee:");
				System.out.println("2.Display by Insurance Scheme:");
				System.out.println("3.Delete employee:");
				System.out.println("4.Exit:\n");
				System.out.println("Enter choice Id From 1 to 4:");
				
				choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice)
				{
				case 1: addEmployee();
				        break;
				case 2: displayByScheme();
				        break;
				case 3: deleteEmployee();
				        break;
				case 4: System.out.println("Exiting....");
				        break;
				default: 
					System.out.println("Invalid choice:");
				}
				
			}while(choice!=4);
		}
	}