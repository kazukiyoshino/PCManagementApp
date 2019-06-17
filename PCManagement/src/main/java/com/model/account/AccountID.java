package com.model.account;

public class AccountID {
	private String id ;

	public AccountID() {

	}
	public AccountID(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "AccountID [id=" + id + "]";
	}


}
