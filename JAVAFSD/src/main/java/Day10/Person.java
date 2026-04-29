package Day10;

public class Person {

	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	public Person(String firstName,String lastName,String gender, int age) throws InvalidNameException
	{

		
		this.firstName = validateName(firstName, "First Name");
		this.lastName = validateName(lastName, "Last Name");
		
		this.gender = gender;
		this.age = age;
	}
	
	private String validateName(String name,String field) throws InvalidNameException
	{
		if(name==null || name.isBlank())
		{
			throw new InvalidNameException(field+ "cannot be blank");
		}
		
		return name;
	}
	
	public void display()
	{
		System.out.println(firstName + " " + lastName+" "+gender + ", "+age);
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			Person p = new Person("" ,"Mailavarapu" , "Male" ,26);
			p.display();
		}
		catch(InvalidNameException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
}

