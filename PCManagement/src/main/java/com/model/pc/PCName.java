package com.model.pc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PCName {

	@NotBlank
	@Size (max = 100)
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
