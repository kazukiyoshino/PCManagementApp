package com.model.pc.os;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class OSName {
	@NotBlank
	@Size(max = 50)
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
