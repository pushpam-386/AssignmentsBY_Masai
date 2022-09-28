package Eve.Classess;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

import java.util.*;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptNam;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> employees=new ArrayList<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptNam() {
		return deptNam;
	}

	public void setDeptNam(String deptNam) {
		this.deptNam = deptNam;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(int deptId, String deptNam, String location, List<Employee> employees) {
		
		this.deptId = deptId;
		this.deptNam = deptNam;
		this.location = location;
		this.employees = employees;
	}

	public Department() {
		
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNam=" + deptNam + ", location=" + location + ", employees="
				+ employees + "]";
	} 
	
	
	
	
}
