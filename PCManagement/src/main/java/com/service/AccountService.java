package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dataaccess.AccountDataAccess;
import com.model.account.Account;

	@Service
	public class AccountService implements UserDetailsService {
	  @Autowired
	  private AccountDataAccess accountDataAccess;

	  @Override
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    if (username == null || username.isEmpty()) {
	      throw new UsernameNotFoundException("");
	    }
	    Account userInfo = accountDataAccess.findByUsername(username);
	    if (userInfo == null) {
	      throw new UsernameNotFoundException("");
	    }
	    return  userInfo;
	  }
	}


