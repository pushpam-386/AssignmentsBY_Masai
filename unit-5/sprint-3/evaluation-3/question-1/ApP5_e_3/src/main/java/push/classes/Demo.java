package push.classes;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws EmployeeException {
		Employee e1=new Employee("Pushpam","Ramnagri",20000);
		Employee e2=new Employee("Rohit","Ramnagr",50000);
		Employee e3=new Employee("Mohit","Bypass",60000);
		
		EmployeeRepo er=new EmployeeRepoImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter EmployeeId:  ");
		int empId=scanner.nextInt();
		Employee employee=er.findEmployee(empId);
		System.out.println(employee.toString());
		
	
		
		System.out.println("Enter EmployeeId for deleting employee:  ");
		int empId2=scanner.nextInt();
	    String str=er.deleteEmployeeDetailsById(empId2);
		System.out.println(str);
		
		
	    Boolean b=er.insertEmployeeDetails(e1);
		System.out.println(b+"Employee inserted");
		
		EmployeeService eService=new EmployeeServiceImplementation();
		
		
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationBean p=app.getBean("pB",PresentationBean.class);
		p.deleteEmployee();
		
		p.insertEmployee();
		
		p.searchEmployee();
	
		
		
		
	}

}
