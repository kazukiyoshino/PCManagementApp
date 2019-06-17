package com.model.account;

public class Account {
	private AccountID accountID;
	private AccountPassword accountPassword;


	public Account() {

	}

	public Account(AccountID accountID,AccountPassword accountPassword) {
		this.accountID = accountID;
		this.accountPassword = accountPassword;
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

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountPassword=" + accountPassword + "]";
	}



}
