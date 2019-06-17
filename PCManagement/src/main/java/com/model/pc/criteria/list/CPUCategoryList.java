package com.model.pc.criteria.list;

import java.util.ArrayList;

import com.model.pc.cpu.CPUCategory;

public class CPUCategoryList {
	private ArrayList<CPUCategory> cpuCategoryList;

	public CPUCategoryList() {

	}
	public CPUCategoryList(ArrayList<CPUCategory> cpuCategoryList) {
		this.cpuCategoryList = cpuCategoryList;
	}
	public ArrayList<CPUCategory> getCpuCategoryList() {
		return cpuCategoryList;
	}
	public void setCpuCategoryList(ArrayList<CPUCategory> cpuCategoryList) {
		this.cpuCategoryList = cpuCategoryList;
	}
	@Override
	public String toString() {
		return "CPUCategoryList [cpuCategoryList=" + cpuCategoryList + "]";
	}

//	public void addCPUCategoryList(CPUCategory cpuCategory) {
//		cpuCategoryList.add(cpuCategory);
//	}


}
