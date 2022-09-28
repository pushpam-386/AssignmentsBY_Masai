package jpql.UseCase;

import java.util.Scanner;

import jpql.interfac.EmployeeException;
import jpql.interfac.JpqlImplementation;
import table.classs.Employee;

public class getEmployeeNameAndSalary {

	public static void main(String[] args) throws EmployeeException {
		JpqlImplementation objectImplementation=new JpqlImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter emplyId to find Employee:  ");
		int empId =scanner.nextInt();
		Object[] o=objectImplementation.getEmployeeNameAndSalary(empId);
		
			
		String str =(String) o[0];
		int i =(int) o[1];
		
	

			System.out.println(str);
			System.out.println(i);
		

	}

}
