package Day32;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee1 {
   
	@Autowired
	Laptop laptop;
	
	public void work()
	{
		laptop.compile();
		System.out.println("Employee is working:");
	}

}