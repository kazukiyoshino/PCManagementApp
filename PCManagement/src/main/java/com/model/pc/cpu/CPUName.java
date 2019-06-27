package com.model.pc.cpu;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CPUName {
	@NotBlank
	@Size(max=100)
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
