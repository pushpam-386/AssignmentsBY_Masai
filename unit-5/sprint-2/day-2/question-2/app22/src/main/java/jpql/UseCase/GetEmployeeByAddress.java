package jpql.UseCase;

import java.util.List;
import java.util.Scanner;

import jpql.interfac.EmployeeException;
import jpql.interfac.JpqlImplementation;
import table.classs.Employee;

public class GetEmployeeByAddress {

	public static void main(String[] args) throws EmployeeException {
		JpqlImplementation objectImplementation=new JpqlImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Address to find Employee:  ");
		String address =scanner.next();
		List<Employee> o=objectImplementation.getEmployeesByAddress(address);
		
		for (Employee employee : o) {
			System.out.println("EmployeeI - "+employee.getEmpID()+", Employee name - "
		+employee.getName()+" , Employee address -  "
					+employee.getAddress()+" ,  Employee salary - "
		+employee.getSalary());
		}
	}

}
