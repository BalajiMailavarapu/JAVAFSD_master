package Day2_Classes;

public class Person {
	public String firstName;
	public String lastName;
	public char gender;
	
	Person(){
		System.out.println("Person Constructor called");
	}
	
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
