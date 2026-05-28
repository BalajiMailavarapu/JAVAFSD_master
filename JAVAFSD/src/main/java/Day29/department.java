package Day29;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int dept_id;
	@Column(name = "dept_name")
	private String dept_name;
	
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL)
	private List<emp> employees;
	public department()
	{
		
	}
	public department(String deptname)
	{
		this.dept_name=deptname;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public List<emp> getEmployees() {
		return employees;
	}
	public void setEmployees(List<emp> employees) {
		this.employees = employees;
	}
	
	

}