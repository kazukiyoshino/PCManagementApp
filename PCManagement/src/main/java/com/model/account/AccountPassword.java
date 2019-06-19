package com.model.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountPassword {
	@Column(name = "account_password")
	private String password;

	public AccountPassword() {

	}
	public AccountPassword(String password) {
		this.password = password;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountPassword [password=" + password + "]";
	}

}
