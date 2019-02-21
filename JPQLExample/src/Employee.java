
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "employeedetails")
public class Employee {
	
	public Employee(){}
	
	@Column(name = "employeename")
	private String emp_name;
	@Id @Column(name = "employeeid")
	private String emp_id;
																 // EMPLOYEE PROPERTIES
	private Double Salary;
	private String deptname;

	
	public Employee(String emp_name, String emp_id, Double salary, String deptname) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		Salary = salary;
		this.deptname = deptname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public Double getSalary() {
		return Salary;
	}


	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", Salary=" + Salary + ", deptname=" + deptname
				+ "]";
	}

	
	
	
	
}
