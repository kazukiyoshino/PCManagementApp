package com.model.pc.criteria.list;

import com.model.pc.PCCategory;
import com.model.pc.PCId;
import com.model.pc.PCName;
import com.model.pc.cpu.CPUName;
import com.model.pc.os.OSCategory;
import com.model.pc.usecategory.UseCategoryId;

public class PCCriteria {
	private PCSort pcSort;
	private CPUCategoryList cpuCategoryList;
	private CPUName cpuName;
	private UseCategoryId useCategoryId;
	private StorageCriteria storageCriteria;
	private MemoryCriteria memoryCriteria;
	private OfficeExistCriteria officeExistCriteria;
	private PCCreateAtYearCriteria pcCreateAtYearCriteria;
	private OSCategory osCategory;
	private PCCategory pcCategory;
	private PCId pcId;
	private PCName pcName;


	public PCCriteria() {

	}


	public PCCriteria(PCSort pcSort,
			CPUCategoryList cpuCategoryList, CPUName cpuName, UseCategoryId useCategoryId,
			StorageCriteria storageCriteria, MemoryCriteria memoryCriteria, OfficeExistCriteria officeExistCriteria,
			PCCreateAtYearCriteria pcCreateAtYearCriteria, OSCategory osCategory, PCCategory pcCategory, PCId pcId,
			PCName pcName) {
		this.pcSort = pcSort;
		this.cpuCategoryList = cpuCategoryList;
		this.cpuName = cpuName;
		this.useCategoryId = useCategoryId;
		this.storageCriteria = storageCriteria;
		this.memoryCriteria = memoryCriteria;
		this.officeExistCriteria = officeExistCriteria;
		this.pcCreateAtYearCriteria = pcCreateAtYearCriteria;
		this.osCategory = osCategory;
		this.pcCategory = pcCategory;
		this.pcId = pcId;
		this.pcName = pcName;
	}


	public PCSort getPcSort() {
		return pcSort;
	}
	public void setPcSort(PCSort pcSort) {
		this.pcSort = pcSort;
	}
	public CPUCategoryList getCpuCategoryList() {
		return cpuCategoryList;
	}
	public void setCpuCategoryList(CPUCategoryList cpuCategoryList) {
		this.cpuCategoryList = cpuCategoryList;
	}
	public CPUName getCpuName() {
		return cpuName;
	}
	public void setCpuName(CPUName cpuName) {
		this.cpuName = cpuName;
	}
	public UseCategoryId getUseCategoryId() {
		return useCategoryId;
	}
	public void setUseCategoryId(UseCategoryId useCategoryId) {
		this.useCategoryId = useCategoryId;
	}
	public StorageCriteria getStorageCriteria() {
		return storageCriteria;
	}
	public void setStorageCriteria(StorageCriteria storageCriteria) {
		this.storageCriteria = storageCriteria;
	}
	public MemoryCriteria getMemoryCriteria() {
		return memoryCriteria;
	}
	public void setMemoryCriteria(MemoryCriteria memoryCriteria) {
		this.memoryCriteria = memoryCriteria;
	}
	public OfficeExistCriteria getOfficeExistCriteria() {
		return officeExistCriteria;
	}
	public void setOfficeExistCriteria(OfficeExistCriteria officeExistCriteria) {
		this.officeExistCriteria = officeExistCriteria;
	}
	public PCCreateAtYearCriteria getPcCreateAtYearCriteria() {
		return pcCreateAtYearCriteria;
	}
	public void setPcCreateAtYearCriteria(PCCreateAtYearCriteria pcCreateAtYearCriteria) {
		this.pcCreateAtYearCriteria = pcCreateAtYearCriteria;
	}
	public OSCategory getOsCategory() {
		return osCategory;
	}
	public void setOsCategory(OSCategory osCategory) {
		this.osCategory = osCategory;
	}
	public PCCategory getPcCategory() {
		return pcCategory;
	}
	public void setPcCategory(PCCategory pcCategory) {
		this.pcCategory = pcCategory;
	}
	public PCId getPcId() {
		return pcId;
	}
	public void setPcId(PCId pcId) {
		this.pcId = pcId;
	}
	public PCName getPcName() {
		return pcName;
	}
	public void setPcName(PCName pcName) {
		this.pcName = pcName;
	}
	@Override
	public String toString() {
		return "PCCriteria [pcSort=" + pcSort + ", cpuCategoryList=" + cpuCategoryList + ", cpuName=" + cpuName
				+ ", useCategoryId=" + useCategoryId + ", storageCriteria=" + storageCriteria + ", memoryCriteria="
				+ memoryCriteria + ", officeExistCriteria=" + officeExistCriteria + ", pcCreateAtYearCriteria="
				+ pcCreateAtYearCriteria + ", osCategory=" + osCategory + ", pcCategory=" + pcCategory + ", pcId="
				+ pcId + ", pcName=" + pcName + "]";
	}

}
