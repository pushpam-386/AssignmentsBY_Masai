package push.classes;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collage collage =ctx.getBean("c",Collage.class);
		collage.showDetails();
		Student s1 =collage.getStudent();
		System.out.println(s1.getName());
	}

}
