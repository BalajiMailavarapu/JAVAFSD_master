package Day5DateAPI;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Date (yyyy-mm-dd)");
		LocalDate ld = LocalDate.parse(sc.nextLine());
		System.out.println(" Enter Zone ID :");
		String s = sc.nextLine();
		System.out.println("Enter warranty years");
		int years = sc.nextInt();
		System.out.println("Enter warranty months");
		int months = sc.nextInt();
		//p.printDateTime(s);
		System.out.println("Cureent Warranty period : "+ p.getWarrantyExpiry(ld, years, months));
		
		Person p1 = new Person("Balaji", "Mailavarapu", LocalDate.of(1999, 06, 28));
		p1.display();
		
		

		sc.close();
		
	}

}
