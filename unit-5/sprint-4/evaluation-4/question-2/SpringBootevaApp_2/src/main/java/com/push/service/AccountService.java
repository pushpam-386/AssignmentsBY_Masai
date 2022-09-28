package com.push.service;

import org.springframework.stereotype.Service;

import com.push.Classes.Account;
import com.push.Classes.AccountDTO;
import com.push.exception.AccountException;
import com.push.exception.InSufficientFundException;

@Service
public interface AccountService {
	
		public Account openAccount(Account acc)throws AccountException;
		
		public Account closeAccount(Integer accno)throws AccountException;
		public Account depositAmount(Integer accno, Integer amount)throws AccountException;
		
		public Account withdrawAmmount(int accno, Integer amount)throws
		AccountException, InSufficientFundException;
		
		public String transferAmount(AccountDTO dto)throws AccountException,InSufficientFundException;
		
}
