package com.model.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountID {

	@Id
	@Column(name = "account_id")
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
