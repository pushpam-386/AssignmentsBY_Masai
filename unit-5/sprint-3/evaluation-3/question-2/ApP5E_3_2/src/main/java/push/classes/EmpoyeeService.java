package push.classes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="es")
public class EmpoyeeService {
	
		@Autowired
		private Map<Department, Employee> theMap; 
		
		@Autowired
		private List<Employee> theList; 
		
		@Autowired
		private String appName; 
		
		public Map<Department, Employee> getTheMap() {
			return theMap;
		}

		public void setTheMap(Map<Department, Employee> theMap) {
			this.theMap = theMap;
		}

		public List<Employee> getTheList() {
			return theList;
		}

		public void setTheList(List<Employee> theList) {
			this.theList = theList;
		}

		public String getAppName() {
			return appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public void printMap(){
			System.out.println(theMap);
		}
		
		public void printList(){
			System.out.println(theList);
		}
		public void printAppName(){
			System.out.println(appName);
		}
		
		
}
