package Day6Arrays1D;

import java.util.Arrays;

public class Products {

	public static void main(String[] args) {
		String products[] = {"TV","Fridge","AC","Mobile","Tablet","WashingMachine"};
		for(int i =0;i < products.length-1;i++) {
			for(int j =i+1;j < products.length ;j++) {
				if(products[i].compareTo(products[j]) > 0) {
					String temp = products[i];
					products[i] = products[j];
					products[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(products));
	}

}
