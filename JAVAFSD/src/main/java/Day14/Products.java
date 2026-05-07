package Day14;
import java.util.ArrayList;
import java.util.Collections;

public class Products {

	public static void main(String[] args) {

		ArrayList <String> products = new ArrayList<>();
		
		products.add("CPU");
		products.add("MONITOR");
		products.add("HARDDISK");
		products.add("Keyboard");
		products.add("MOUSE");
		
		Collections.sort(products,Collections.reverseOrder());
		System.out.println("Sorted product names:");
		
		for(String product: products)
		{
			System.out.println(product);
		}

	}

}