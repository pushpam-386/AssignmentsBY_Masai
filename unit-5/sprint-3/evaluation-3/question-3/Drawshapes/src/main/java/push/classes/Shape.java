package push.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="s")
public class Shape {
	
	@Autowired
	private Shapes shapes;
	
	public void show() {
		System.out.println("Inside shape ");
		System.out.println(shapes);
	}
	

}
