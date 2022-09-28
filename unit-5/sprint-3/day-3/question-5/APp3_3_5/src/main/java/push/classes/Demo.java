package push.classes;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private Map<Department, Employee> theMap;
	
	
	
	public Map<Department, Employee> getTheMap() {
		return theMap;
	}


	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	
	

	public void myInit(){
		System.out.println("inside myInit method");
		}
	

	public void cleanUp(){
		System.out.println("inside cleanUp method");
		}
	
	
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		for (Map.Entry<Department,Employee> entry : theMap.entrySet()) {
			System.out.println("DepartmentId-->  "+entry.getKey().getDeptId());
			System.out.println("DepartmentName-->  "+entry.getKey().getDeptName());
			System.out.println("DepartmentLocation-->  "+entry.getKey().getLocation());
			
			System.out.println("Employee Details-->  "+entry.getValue().toString());
		}
		}

	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo=ctx.getBean("dem",Demo.class);
		demo.showDetails();
		
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
		
	}

}
