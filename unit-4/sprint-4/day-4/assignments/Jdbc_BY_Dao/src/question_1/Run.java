package question_1;

public class Run {

	public static void main(String[] args) {
		
		
		Employee3 objDetails1=new Employee3(1,"Pushpam","Ramnagri",4000);
		Employee3 objDetails2=new Employee3(2,"Rohan","Ramnagri",9000);
		Employee3 objDetails3=new Employee3(3,"Sohan","Ramnagri",4000);
		Employee3 objDetails4=new Employee3(4,"Mac","Ramnagri",6000);
		
		Methods objMethods=new Methods();
		objMethods.insertDetails(objDetails1);
		objMethods.insertDetails(objDetails2);
		objMethods.insertDetails(objDetails3);
		objMethods.insertDetails(objDetails4);
		//objMethods.insertDetails(objDetails2);
		
		objMethods.getAllDetails("employee3");
		
		objMethods.getDeatailsBySalary(8000);
		
		objMethods.getNameOfId(1);

		objMethods.updateSalary(500);
		
		objMethods.getSalary(1);
		

	}

}
