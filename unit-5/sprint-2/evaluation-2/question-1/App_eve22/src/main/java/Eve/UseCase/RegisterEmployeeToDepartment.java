package Eve.UseCase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Eve.Conection.GetEMFClass;
import Eve.Exception.DepartmentException;
import Eve.Exception.EmployeeException;

public class RegisterEmployeeToDepartment {

	public static void main(String[] args) throws EmployeeException, DepartmentException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter DepId and EmpId: ");
		int depId =scanner.nextInt();
		int empId=scanner.nextInt();
		
		InterfacEDao interfacEDao=new EveImplementsss();
		
		interfacEDao.registerEmployeeTODepartment(empId,depId);

	}

}
