package com.model.pc.os;

public class OSName {
	private String name;

	public OSName() {

	}
	public OSName(String name) {
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
		return "OSName [name=" + name + "]";
	}



}
