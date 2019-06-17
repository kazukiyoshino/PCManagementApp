package com.model.pc;

public class PCName {
	private String name;

	public PCName() {

	}
	public PCName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PCName [name=" + name + "]";
	}




}
