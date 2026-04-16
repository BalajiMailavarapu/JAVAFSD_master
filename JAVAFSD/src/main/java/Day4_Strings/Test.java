package Day4_Strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter the Operation you want to Perform ");
		String s2 = sc.nextLine();
		
		UserPreference up = new UserPreference();
		System.out.println(up.stringManupulation(s1, s2));
		
		PositiveString ps = new PositiveString();
		System.out.println("Given String :"+ s1);
		System.out.println("Postitive String : "+ ps.checkPositive(s1));
	}

}
