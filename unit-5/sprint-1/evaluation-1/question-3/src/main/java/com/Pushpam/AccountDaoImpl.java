package com.Pushpam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDaoImpl implements AccountDaoInterface {

	@Override
	public Account findById(int id) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		em.close();
		
		Account account=em.find(Account.class, id);
		
		return account;
	}

	@Override
	public String save(Account account) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		EntityTransaction eTransaction=em.getTransaction();
		
		eTransaction.begin();
		em.persist(account);
		eTransaction.commit();
		em.close();
		return account.getEmail();
	}

	@Override
	public String update(Account account) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		return null;
	}

	@Override
	public String remove(int id) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		return null;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		return null;
	}

	@Override
	public String deposit(double amount, int accountId) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("bankDB");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		return null;
	}
	

}
