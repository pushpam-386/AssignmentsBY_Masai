package push.classes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value= "add")
public class Address {
	
	@Autowired
	private List<Students> students;
	
	@PostConstruct
	public void setUp() {
	System.out.println("inside set up method");
	}
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}

	
	
	public void show() {
		System.out.println("inside address class");
		System.out.println(students);
	}

}
