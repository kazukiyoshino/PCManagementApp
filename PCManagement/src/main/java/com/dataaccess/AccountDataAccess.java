package com.dataaccess;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.account.Account;

public interface AccountDataAccess extends JpaRepository<Account, String> {
	    public Account findByUsername(String username);

}
