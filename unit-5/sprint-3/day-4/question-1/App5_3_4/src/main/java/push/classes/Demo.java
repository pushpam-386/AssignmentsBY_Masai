package push.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext acx =new AnnotationConfigApplicationContext(AppConfig.class);
		Students students=acx.getBean("s1",Students.class);
		
		students.show();
		
		Address address =acx.getBean("add",Address.class);
		address.show();
		
		AnnotationConfigApplicationContext acc= (AnnotationConfigApplicationContext) acx;
		acc.close();
	}

}
