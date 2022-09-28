package Daoimplementation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Daointerface.jpa.DaoInterface;
import Daointerface.jpa.EmployeeException;
import EMF.jpa.EMF_Connect;
import employee.jpa.Employee;

public class DaoImplementation implements DaoInterface {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		EntityManager em=EMF_Connect.provideEM();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
		em.close();
		
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManager em=EMF_Connect.provideEM();
		Employee employe=em.find(Employee.class, empId);
		if(employe==null) {
			throw new EmployeeException("Employee not Found to show Details: ");
		}
		
		return employe;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em=EMF_Connect.provideEM();
		Employee employe=em.find(Employee.class, empId);
	    EntityTransaction et=em.getTransaction();
		if (employe!=null) {
			et.begin();
			em.remove(employe);
			et.commit();
		}
		else {
			throw new EmployeeException("Employee not found to Delete: ");
		}
		em.close();
		return employe;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManager em=EMF_Connect.provideEM();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(employee);
		et.commit();
		em.close();
		
		return employee;
	}

}
