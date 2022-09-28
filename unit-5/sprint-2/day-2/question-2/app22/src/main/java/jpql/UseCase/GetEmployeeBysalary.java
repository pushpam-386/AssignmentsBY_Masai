package jpql.UseCase;

import java.util.List;
import java.util.Scanner;

import jpql.interfac.EmployeeException;
import jpql.interfac.JpqlImplementation;
import table.classs.Employee;

public class GetEmployeeBysalary {

	public static void main(String[] args) throws EmployeeException {
		JpqlImplementation objectImplementation=new JpqlImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empId to find Employee:  ");
		int id =scanner.nextInt();
		int salary=objectImplementation.getE1mployeeSalaryById(id);
		System.out.println(salary);

	}

}
