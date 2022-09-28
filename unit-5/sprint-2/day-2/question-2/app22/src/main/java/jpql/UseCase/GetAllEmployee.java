package jpql.UseCase;

import java.util.List;

import jpql.interfac.EmployeeException;
import jpql.interfac.JpqlImplementation;
import table.classs.Employee;

public class GetAllEmployee {

	public static void main(String[] args) throws EmployeeException {
		JpqlImplementation objectImplementation=new JpqlImplementation();
		List<Employee> l1=objectImplementation.getAllEmployees();
		for (Employee employee : l1) {
			System.out.println("EmployeeID - "+employee.getEmpID()+", Employee name - "
		+employee.getName()+" , Employee address -  "
					+employee.getAddress()+" ,  Employee salary - "
		+employee.getSalary());
		}
	}

}
