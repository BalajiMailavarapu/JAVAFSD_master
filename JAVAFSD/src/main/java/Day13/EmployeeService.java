package Day13;

import java.io.*;
import java.util.*;

public class EmployeeService {

	private static final String FILE_NAME = "C:\\\\Users\\\\Administrator\\\\Downloads\\\\employee.txt.txt";
	
	public void validateEmployee(Employee e)throws CustomEmployeeException
	{
		if(e.salary<3000)
		{
			throw new CustomEmployeeException("Salary should be >=3000");
		}
	}
	
	public void writeEMployee(Employee e)throws IOException
	{
		FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
		ObjectOutputStream oos;
		
		File file = new File(FILE_NAME);
		
		if(file.length()==0)
		{
			oos = new ObjectOutputStream(fos);
		}
		else
		{
			oos = new ObjectOutputStream(fos)
					{
				      protected void writeStreamHeader() throws IOException
				      {
				    	  reset();
				      }
					};
		}
		
		oos.writeObject(e);
		oos.close();
	}
	public void readEmployees() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("Employee details from file:");
		
		while(fis.available()>0)
		{
			Employee e = (Employee) ois.readObject();
			System.out.println(e);
		}
		ois.close();
	}
}