package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSort {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of products:");
		
		int n = sc.nextInt();
		sc.nextLine();
	
		String[] products = new String[n];
		
		System.out.println("Enter product names:");
		for(int i = 0 ; i<n; i++)
		{
			products[i] = sc.nextLine();
		}
		Arrays.sort(products);
		
		System.out.println("\nSorted product list");
		for(String product:products)
		{
			System.out.println(product);
		}
		sc.close();
	}

}