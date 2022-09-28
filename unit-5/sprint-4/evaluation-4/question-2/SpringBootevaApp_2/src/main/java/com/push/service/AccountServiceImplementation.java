package com.push.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.Classes.Account;
import com.push.Classes.AccountDTO;
import com.push.exception.AccountException;
import com.push.exception.InSufficientFundException;
import com.push.repo.AccountRepoDao;

@Service
public class AccountServiceImplementation implements AccountService{
	
	
	@Autowired
	private AccountRepoDao accountRepoDao;
	
	

	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account account=accountRepoDao.save(acc);
		
		if (account!=null) {
			return account;
		}
		else {
			throw new AccountException("Account Not created");
		}
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withdrawAmmount(int accno, Integer amount) throws AccountException, InSufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InSufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

}
