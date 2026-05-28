package Day29;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class validations {
@Id
private int emp_id;

@NotNull
@Size(min=3,max=20)
private String emp_name;
	
}