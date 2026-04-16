package Day4_Strings;

public class PositiveString {
	
	public boolean checkPositive(String s) {
		int count =0;
		for(int i =0;i<s.length()-1;i++) {
			if((int) s.charAt(i) < (int) s.charAt(i+1)) {
				count  =0;
			}else {
				count++;
			}
		}
		return count == 0;
	}

}
