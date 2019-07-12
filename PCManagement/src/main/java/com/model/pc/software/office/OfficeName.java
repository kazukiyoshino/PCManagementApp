package com.model.pc.software.office;

import javax.validation.constraints.Size;

public class OfficeName {
	@Size(max = 100)
	private String name;

	public OfficeName() {

	}

	public OfficeName(String name) {
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
		return "OfficeName [name=" + name + "]";
	}




}
