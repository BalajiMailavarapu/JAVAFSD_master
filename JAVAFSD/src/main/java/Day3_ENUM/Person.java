package Day3_ENUM;

import java.util.Scanner;

public class Person {
	public String firstName;
	public String lastName;
	public Gender m;
	
	
	

	Person(){
		System.out.println("Person Constructor called");
	}
	
	public Person(String firstName, String lastName, Gender m) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.m = m;
	}
	
	public String getMobileNumber() {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String num = c.nextLine();
		return num;
		
	}
	
	public void display(Person p) {
		String mobileNumber = p.getMobileNumber();
		System.out.println("Person Details");
		System.out.println("______________");
		System.out.println(" ");
		System.out.println("First Name : "+p.getFirstName());
		System.out.println("Last Name : "+p.getLastName());
		System.out.println("Gender : "+p.getM());
		System.out.println("Mobile Number : "+ mobileNumber);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getM() {
		return m;
	}

	public void setM(Gender m) {
		this.m = m;
	}

}
