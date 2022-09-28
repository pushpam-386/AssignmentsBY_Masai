package push.classes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "push.classes")
@PropertySource("a1.properties")
public class ConfigureClasss {
	
	@Bean("map")
	public Map<Department, Employee> gettheMap(){
		EmpoyeeService empoyeeService=new EmpoyeeService();
//		empoyeeService.getTheMap().put(null, null);
		return null;
	}
	
	@Bean("list")
	public List<Employee> getList(){
		EmpoyeeService empoyeeService=new EmpoyeeService();
//		empoyeeService.getTheList().add(null);
		return null;
	}
	
	@Bean("appName")
	public String getappName() {
		EmpoyeeService empoyeeService=new EmpoyeeService();
	
//		empoyeeService.getAppName();
		return null;
	}
	
}
