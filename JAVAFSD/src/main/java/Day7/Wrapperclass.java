package Day7;

import java.util.ArrayList;
import java.util.List;

public class Wrapperclass {
	
	void printsquare(Integer x5)
	{
		if(x5 instanceof Integer)
		{
			System.out.println("x5 is an object");
		}
	Integer s6=x5*x5;
	if(s6 instanceof Integer)
	{
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wrapperclass ob5= new Wrapperclass();
		
		Integer num5=5;
		
      System.out.println("Integer max value: "+Integer.MAX_VALUE);
      System.out.println("Integer minimum:" +Integer.MIN_VALUE);

	    if(num5 instanceof Integer)
	    {
	    	System.out.println("Instance of an object");
	    }
	   ob5.printsquare(num5);
	   
	   Integer a1=10;
	   Integer a2=20;
	   
	   Integer sum = a1+a2;
	   Integer multi = sum*2;
	   
	   int x6=10;
	   
	   Integer ob = Integer.valueOf(x6);
	   
	   int z = ob.intValue();
	   
	   Integer y = 30;
	  
	   int y1=y;
	 ArrayList<Integer>list = new ArrayList<>();
	 list.add(10);
	 list.add(30);
	 System.out.println(list);
	 
	 Integer obj = new Integer(10);
	 Integer obj1 = Integer.valueOf(10);
	 
	 Integer obj3 = 100;
	 
	 int x = obj3;
	 
	 
	 int num = Integer.parseInt("1234");
	 double dou = Double.parseDouble("10.6");
	 String s = Integer.toString(2000);
	 
	 Integer a = 100, b=30;
	 
	 System.out.println(a.compareTo(b));
	 a=a+10;
	 
	 List<Integer> bookid = new ArrayList<>();
	 
	 bookid.add(101);
	 bookid.add(200);
	 
	 
	 for(Integer id:bookid)
	 {
		 int value =id;
	 }
	}
}
