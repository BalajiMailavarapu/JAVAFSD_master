package Day7;

public class Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		
		System.out.println("Total memory:"+r.totalMemory());
		System.out.println("Free memory:"+r.freeMemory());
		
		for(int i =0;i<10000;i++)
		{
			new Memory();
		}
		
		System.gc();
	    System.out.println("After GC:"+r.freeMemory());
	}

}