package myMavanApp_1;

import java.util.List;

public class Run {

	public static void main(String[] args) {
		Methods objMethods=new Methods();
		
		Emp objDetails1=new Emp(1,"Pushpam","Ramnagri",4000);
		Emp objDetails2=new Emp(2,"Rohan","Ramnagri",9000);
		Emp objDetails3=new Emp(3,"Sohan","Ramnagri",4000);
		Emp objDetails4=new Emp(4,"Mac","Ramnagri",6000);
		
		
		objMethods.insertDetails(objDetails1);
		objMethods.insertDetails(objDetails2);
		objMethods.insertDetails(objDetails3);
		objMethods.insertDetails(objDetails4);
		
		try {
			List<Emp> emppp=objMethods.getAllEmployee();
			for (Emp emp : emppp) {
				System.out.println(emp.getE_id()+"   "+emp.getName()+"   "+emp.getAddress()+"  "+emp.getSalary());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
