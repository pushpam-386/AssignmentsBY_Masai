package push.classes;

import org.springframework.stereotype.Service;

@Service(value = "c1")
public class Car {
	
	public void show() {
		System.out.println("inside car class");
	}
}
