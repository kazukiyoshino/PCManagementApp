package com.model.pc.cpu;

import javax.validation.Valid;

public class CPU {
	private CPUCategory cpuCategory;
	@Valid
	private CPUName cpuName;

	public CPU() {

	}
	public CPU(CPUCategory cpuCategory,CPUName cpuName) {
		this.cpuCategory = cpuCategory;
	}

	public CPUCategory getCpuCategory() {
		return cpuCategory;
	}

	public void setCpuCategory(CPUCategory cpuCategory) {
		this.cpuCategory = cpuCategory;
	}

	public CPUName getCpuName() {
		return cpuName;
	}

	public void setCpuName(CPUName cpuName) {
		this.cpuName = cpuName;
	}
	@Override
	public String toString() {
		return "CPU [cpuCategory=" + cpuCategory + ", cpuName=" + cpuName + "]";
	}





}
