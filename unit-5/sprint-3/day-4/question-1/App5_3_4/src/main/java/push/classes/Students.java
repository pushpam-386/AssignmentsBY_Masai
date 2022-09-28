package push.classes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value= "s1")
public class Students {
	
	@Autowired
	private List<String> cities;
	
	
	private int roll;
	private String name;
	private String address;
	
	
	
	@PostConstruct
	public void setUp() {
	System.out.println("inside set up method");
	}
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}
	
	public Students(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	
	public void show() {
		System.out.println("inside class students");
		System.out.println(cities);
	}

}
