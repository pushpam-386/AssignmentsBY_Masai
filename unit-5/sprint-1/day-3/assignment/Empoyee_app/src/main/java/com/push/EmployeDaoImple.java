package com.push;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.security.auth.login.AccountException;

public class EmployeDaoImple implements EmployeDaoInterface{

	@Override
	public void save(Employe emp) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Unit");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(emp);
		
		et.commit();
		
		em.close();
		
		System.out.println("Done...");
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Unit");
		EntityManager em=emf.createEntityManager();
		
		Employe employe=em.find(Employe.class, empId);
		if(employe!=null) {
		return employe.getAddress();
		}
		else {
			String string="not found";
			return string;
		}
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Unit");
		EntityManager em=emf.createEntityManager();
		
		Employe employe=em.find(Employe.class, empId);
		if(employe!=null) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		employe.setSalary(employe.getSalary()+bonus);
		em.persist(employe);
		et.commit();
		
		em.close();
		String str="bonus given";
		return str;
		}
		
		else {
			String string="not found";
			return string;
		}
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Unit");
		EntityManager em=emf.createEntityManager();
		
		Employe employe=em.find(Employe.class, empId);
		if(employe!=null) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(employe);
		et.commit();
		
		em.close();
		
		return true;
		}
		else {
			return false;
		}
		
	}

}
