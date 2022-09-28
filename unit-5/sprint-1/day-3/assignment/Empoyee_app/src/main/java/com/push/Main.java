package com.push;



public class Main {

	public static void main(String[] args) {
	
		Employe employe=new Employe(1,"Pushpam","Ramnagri",5000);
		Employe employe2=new Employe(2,"Pushpam","Ramnagri",4000);
		Employe employe3=new Employe(3,"Pushpam","Ramnagri",6000);
		Employe employe4=new Employe(4,"Pushpam","Ramnagri",7000);
		EmployeDaoInterface eDI=new EmployeDaoImple();
		
		eDI.save(employe);
		eDI.save(employe2);
		eDI.save(employe3);
		eDI.save(employe4);
		 
		eDI.getAddressOfEmployee(3);
		
		eDI.giveBonusToEmployee(2, 500);
		
		eDI.deleteEmployee(1);
	}
	
}
