package push.classes;

import java.util.List;

import org.springframework.stereotype.Repository;


public interface EmployeeRepo {
	public boolean insertEmployeeDetails(Employee emp);
	public List getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);
}
