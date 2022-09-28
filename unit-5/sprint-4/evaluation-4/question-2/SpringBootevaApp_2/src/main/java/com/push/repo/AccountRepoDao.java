package com.push.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.push.Classes.Account;

@Repository
public interface AccountRepoDao extends JpaRepository<Account, Integer> {

}
