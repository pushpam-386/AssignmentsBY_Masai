package com.Pushpam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    
	@Id
	private int id;
	private String email;
	private String address;
	private String balance;
	public Account() {
	}
	
	
	public Account(int id, String email, String address, String balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	
	
}
