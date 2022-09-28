package push.classes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value="t1")
@Scope("prototype")
public class Travel {
	
	@Autowired
	private Car car;
	
	@Autowired
	private Bike bike;
	
	public void Show() {
		System.out.println("inside travel class");
		System.out.println(car);
		System.out.println(bike);
	}
	
	@PostConstruct
	public void setUp() {
	System.out.println("inside set up method");
	}
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}

}
