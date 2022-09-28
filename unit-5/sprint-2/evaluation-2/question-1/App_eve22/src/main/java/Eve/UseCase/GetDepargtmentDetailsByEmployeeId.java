package Eve.UseCase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Eve.Classess.Department;
import Eve.Classess.Employee;
import Eve.Conection.GetEMFClass;
import Eve.Exception.DepartmentException;

public class GetDepargtmentDetailsByEmployeeId {

	public static void main(String[] args) throws DepartmentException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter EmpId : ");
		int empId =scanner.nextInt();

		
		InterfacEDao interfacEDao=new EveImplementsss();
		
		Department depatment=interfacEDao.getDepartmentDetailsByEmployeeId(empId);

		System.out.println(depatment.toString());


	}

}
