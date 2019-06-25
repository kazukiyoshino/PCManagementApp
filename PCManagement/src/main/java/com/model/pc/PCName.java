package com.model.pc;

import javax.validation.constraints.Size;

public class PCName {
	//@NotBlank(message = "PCモデル名を入力してください")
	@Size(max = 100,message="100文字以下で入力してください")
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
