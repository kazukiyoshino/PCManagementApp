package com.model.pc.software.office;

public class OfficeExist {
	private boolean exist;

	public OfficeExist() {

	}
	public OfficeExist(boolean exist) {
		this.exist = exist;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}
	@Override
	public String toString() {
		return "OfficeExist [exist=" + exist + "]";
	}



}
