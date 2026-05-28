package Day32;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

	
	@Bean
	public Laptop laptop()
	{
		return new Laptop();
	}
	
	@Bean
	public Employee employee()
	{
		Employee emp = new Employee();
		emp.setLaptop(laptop());
		return emp;
	}
}