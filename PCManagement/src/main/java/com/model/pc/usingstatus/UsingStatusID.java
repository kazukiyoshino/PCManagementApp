package com.model.pc.usingstatus;

public class UsingStatusID {
	private  Integer id;

	public UsingStatusID() {

	}
	public UsingStatusID(Integer id) {
		this.id = id ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UsingStatusID [id=" + id + "]";
	}



}
