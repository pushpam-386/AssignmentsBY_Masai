package push.classes;

import org.springframework.stereotype.Service;

@Service
public class Cylinder implements Shapes {
	
	public void draw() {
		System.out.println("You have drawn cylinder");
		
	}

}
