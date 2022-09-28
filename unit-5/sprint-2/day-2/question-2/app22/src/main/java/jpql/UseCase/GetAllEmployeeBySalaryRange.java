package jpql.UseCase;

import java.util.List;
import java.util.Scanner;

import jpql.interfac.EmployeeException;
import jpql.interfac.JpqlImplementation;
import table.classs.Employee;

public class GetAllEmployeeBySalaryRange {

	public static void main(String[] args) throws EmployeeException {
		JpqlImplementation objectImplementation=new JpqlImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter start range salary to find Employee:  ");
		int startsal =scanner.nextInt();
		System.out.println("Enter end range salary to find Employee:  ");
		int endsal =scanner.nextInt();
		List<Employee> l1=objectImplementation.getAllEmployeeWithRangeSalary(startsal, endsal);
		for (Employee employee : l1) {
			System.out.println("EmployeeI - "+employee.getEmpID()+", Employee name - "
		+employee.getName()+" , Employee address -  "
					+employee.getAddress()+" ,  Employee salary - "
		+employee.getSalary());
		}
	}

}
