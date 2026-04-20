package Day5DateAPI;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	public Person(String firstName, String lastName, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	
	public int calculateAge() {
		return Period.between(dob,LocalDate.now()).getYears();
	}
	
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	public void display() {
		System.out.println("FullName : "+getFullName());
		System.out.println("Age : "+calculateAge());
		System.out.println("DOB : "+ dob);
	}

}
