package com.model.account;

public enum AccountAuthority {

	ROLE_USER("一般"),
	ROLE_ADMIN("管理者");

	String authorityName;

	private AccountAuthority(String authority) {
		this.authorityName = authority;
	}

	public String getAuthority() {
		return authorityName;
	}

	public void setAuthority(String authority) {
		this.authorityName = authority;
	}

}





