package push.classes;

import org.springframework.stereotype.Service;

@Service(value = "b1")
public class Bike {
	
	
	public void show() {
		System.out.println("inside bike class");
	}
	
}
