package com.model.pc.software.office;

import javax.validation.Valid;

public class Office {
	@Valid
	private OfficeName officeName;
	private OfficeExist officeExist;

	public Office() {

	}
	public Office(OfficeName officeName,OfficeExist officeExist) {
		this.officeName = officeName;
		this.officeExist = officeExist;
	}

	public OfficeName getOfficeName() {
		return officeName;
	}

	public void setOfficeName(OfficeName officeName) {
		this.officeName = officeName;
	}

	public OfficeExist getOfficeExist() {
		return officeExist;
	}

	public void setOfficeExist(OfficeExist officeExist) {
		this.officeExist = officeExist;
	}
	@Override
	public String toString() {
		return "Office [officeName=" + officeName + ", officeExist=" + officeExist + "]";
	}




}
