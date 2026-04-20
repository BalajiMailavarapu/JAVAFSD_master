package Day5DateAPI;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Practice {
	public LocalDate getWarrantyExpiry(LocalDate date,int years,int months) {
		return date.plusYears(years).plusMonths(months);
		
	}
	
	public void printDateTime(String zone) {
		ZoneId z = ZoneId.of(zone);
		ZonedDateTime dateTime = ZonedDateTime.now(z);
		System.out.println("Current Date Time in "+z+": "+dateTime);
	}

}
