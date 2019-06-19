package com.dataaccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.account.Account;
import com.model.account.AccountRepository;

@Repository("accountRepository")
public class AccountDataAccess implements AccountRepository {

	@Autowired
	AccountMapper accountMapper;

	public Account findByUsername(String username) {
		return accountMapper.findByUsername(username);
	}

}
