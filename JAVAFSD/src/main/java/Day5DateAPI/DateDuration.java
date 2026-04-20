package Day5DateAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//lab 1.11,1.12
public class DateDuration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-mm-dd)");
		String input = sc.nextLine();
		LocalDate inputDate = LocalDate.parse(input);
		System.out.println("Enter Date to compare (yyyy-mm-dd)");
		
		String input2 = sc.nextLine();
		LocalDate inputDate2 = LocalDate.parse(input2);
		
		Period period = Period.between(inputDate, inputDate2);
		System.out.println(period.getYears() + " years,"+ period.getMonths()+" months,"+period.getDays()+" days.");
	}

}
