package Eve.UseCase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Eve.Classess.Department;
import Eve.Classess.Employee;
import Eve.Conection.GetEMFClass;
import Eve.Exception.EmployeeException;

public class GetAllEmployeeWithDepartmentName {

	public static void main(String[] args) throws EmployeeException {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter DepName : ");
		String depName =scanner.next();

		
		InterfacEDao interfacEDao=new EveImplementsss();
		
		List<Employee> employees=interfacEDao.getAllEmployeeWithDeptName(depName);

		System.out.println(employees);

	}

}
