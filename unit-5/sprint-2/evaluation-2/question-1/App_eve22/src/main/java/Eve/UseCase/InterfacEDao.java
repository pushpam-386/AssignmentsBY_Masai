package Eve.UseCase;

import java.util.List;

import Eve.Classess.Department;
import Eve.Classess.Employee;
import Eve.Exception.DepartmentException;
import Eve.Exception.EmployeeException;

public interface InterfacEDao {

	public void addDepartment(Department dept);
	public void addEmployee(Employee emp);
	
	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException;
	
	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException;
}
