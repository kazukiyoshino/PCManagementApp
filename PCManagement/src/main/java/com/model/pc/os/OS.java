package com.model.pc.os;

import javax.validation.Valid;

public class OS {
	private OSCategory osCategory;
	@Valid
	private OSName osName;

	public OS() {

	}
	public OS(OSCategory osCategory,OSName osName) {
		this.osCategory = osCategory;
		this.osName = osName;
	}

	public OSCategory getOsCategory() {
		return osCategory;
	}

	public void setOsCategory(OSCategory osCategory) {
		this.osCategory = osCategory;
	}

	public OSName getOsName() {
		return osName;
	}

	public void setOsName(OSName osName) {
		this.osName = osName;
	}
	@Override
	public String toString() {
		return "OS [osCategory=" + osCategory + ", osName=" + osName + "]";
	}


}
