package com.model.pc.cpu;

public class CPUName {
	private String name;

	public CPUName() {

	}
	public CPUName(String name) {
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
		return "CPUName [name=" + name + "]";
	}



}
