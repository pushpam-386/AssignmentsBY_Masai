package push.classes;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="pB")
public class PresentationBean {
	
	@Autowired
	private EmployeeService empService; 
	
	
	public void insertEmployee(){
		Employee e1=new Employee("Pushpam","Ranma",70000);
		EmployeeService eService=new EmployeeServiceImplementation();
		Boolean b=eService.saveEmployee(e1);
		
	}
	
	public void printAllEmployee(){
	
	}
	
	public void searchEmployee() throws EmployeeException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empId to search");
		int i =scanner.nextInt();
		EmployeeService eService=new EmployeeServiceImplementation();
		Employee employee=eService.getEmployeeById(i);
		System.out.println(employee.toString());
		throw new EmployeeException("Employee not found");
	}
	
	public void deleteEmployee() throws EmployeeException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empId to delete");
		int i =scanner.nextInt();
		EmployeeService eService=new EmployeeServiceImplementation();
		String srt=eService.deleteEmployeeById(i);
		System.out.println(srt);
		throw new EmployeeException("EmmpId not Found");
	}
	

}
