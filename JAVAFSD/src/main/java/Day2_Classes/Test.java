package Day2_Classes;

public class Test {

	public static void main(String[] args) {
 
		Person p = new Person("Balaji","Mailavarapu",'M');
		System.out.println("Person Details");
		System.out.println("______________");
		System.out.println(" ");
		System.out.println("First Name : "+p.getFirstName());
		System.out.println("Last Name : "+p.getLastName());
		System.out.println("Gender : "+p.getGender());
	}

}
