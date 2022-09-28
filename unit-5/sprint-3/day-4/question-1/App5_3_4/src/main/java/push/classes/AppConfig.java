package push.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "push.classes")
public class AppConfig {
	
	@Bean("clist")
	public List<String> getcities(){
	List<String> citie = new ArrayList<String>();
	citie.add("city1");
	citie.add("city2");
	citie.add("city3");
	citie.add("city4");
	return citie;
	}

	@Bean("slist")
	public List<Students> getstudents(){
		List<Students> s1= new ArrayList<>();
		
		s1.add(new Students(1,"Pushpam","Ramnagri"));
		s1.add(new Students(2,"rohit","gofhgop"));
		s1.add(new Students(3,"Mohit","hdzofhgop"));
		s1.add(new Students(4,"Sohit","gofhfaf"));
		
		return s1;
		
	}
	

}
