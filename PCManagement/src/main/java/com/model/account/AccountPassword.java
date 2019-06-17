package com.model.account;

public class AccountPassword {
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
