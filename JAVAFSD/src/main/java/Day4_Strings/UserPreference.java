package Day4_Strings;

import java.util.stream.Collectors;

public class UserPreference {
	
	public String stringManupulation(String s,String  userPre) {
		String s1 ="";
		if(userPre.equalsIgnoreCase("add the string to itself")) {
			s1 =  s.concat(s);
		}else if(userPre.equalsIgnoreCase("Replace odd position with #")) {
			for(int i =0;i < s.length();i++) {
				if(i%2 != 0) {
					s1+="#";
				}else {
					s1+=s.charAt(i);
				}
			}
		}else if(userPre.equalsIgnoreCase("remove duplicate char from string")) {
			s1 = s.chars().mapToObj(c -> String.valueOf((char)c)).distinct().collect(Collectors.joining());
		}else if(userPre.equalsIgnoreCase("Change odd position to uppercase")){
			for(int i =0;i < s.length();i++) {
				String s2 = ""+ s.charAt(i);
				if(i%2 != 0) {
					s1+=s2.toUpperCase();
				}else {
					s1+=s.charAt(i);
				}
			}
		}else {
			System.out.println("Enter Correct choice");
		}
		return s1;
		
	}

}
