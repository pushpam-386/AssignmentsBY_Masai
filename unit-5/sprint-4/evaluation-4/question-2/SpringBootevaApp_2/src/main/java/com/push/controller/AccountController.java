package com.push.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.push.Classes.Account;
import com.push.exception.AccountException;
import com.push.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("saveaccount")
	public ResponseEntity<Account> saveAccount(@RequestBody Account account) throws AccountException {
		Account account2=accountService.openAccount(account);
		
		return ResponseEntity<Account>(account2,HttpStatus.BAD_REQUEST);
	} 

}
