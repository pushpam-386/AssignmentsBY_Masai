package com.push;

public interface EmployeDaoInterface {
	
	public void save(Employe emp);
	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);

}
