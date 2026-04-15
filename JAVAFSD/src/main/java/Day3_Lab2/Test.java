package Day3_Lab2;

public class Test {

	public static void main(String[] args) {
 
		Person p1 = new Person("Smith",26);
		Person p2 = new Person("Kathy",25);
		Account a1 = new Account(p1,2000);
		Account a2 = new Account(p2,3000);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("________________________________________________________");
		a1.deposite(2000);
		a2.withdraw(2000);
		System.out.println("________________________________________________________");

		
		
		System.out.println("Updated account Details");
		System.out.println("________________________________________________________");
		System.out.println(a1);
		System.out.println(a2);
	}

}
