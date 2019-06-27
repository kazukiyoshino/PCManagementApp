package com.model.pc;

public class PCId {

	private Integer id;

	public PCId() {

	}
	public PCId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PCID [id=" + id + "]";
	}




}
