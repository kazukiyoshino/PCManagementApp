package com.model.account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class Account implements UserDetails {
	private AccountID accountID;
	private AccountPassword accountPassword;
	private AccountAuthority accountAuthority;


	public Account() {

	}

	public Account (AccountID accountID,AccountPassword accountPassword,AccountAuthority accountAuthority) {
		this.accountID = accountID;
		this.accountPassword = accountPassword;
		this.accountAuthority = accountAuthority;
	}

	public AccountID getAccountID() {
		return accountID;
	}

	public void setAccountID(AccountID accountID) {
		this.accountID = accountID;
	}

	public AccountPassword getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(AccountPassword accountPassword) {
		this.accountPassword = accountPassword;
	}



	public AccountAuthority getAccountAuthority() {
		return accountAuthority;
	}

	public void setAccountAuthority(AccountAuthority accountAuthority) {
		this.accountAuthority = accountAuthority;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountPassword=" + accountPassword + "]";
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(accountAuthority.toString()));
        return authorities;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return accountID.getId();
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return accountPassword.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}





}
