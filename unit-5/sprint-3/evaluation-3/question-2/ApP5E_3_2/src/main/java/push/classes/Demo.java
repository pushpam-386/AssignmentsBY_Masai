package push.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext acx=new AnnotationConfigApplicationContext("ConfigureClasss");
		
		EmpoyeeService eService =acx.getBean("es",EmpoyeeService.class);
		eService.getTheList();
		eService.getTheMap();
		eService.getAppName();
	

	}

}
