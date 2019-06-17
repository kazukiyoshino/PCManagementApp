package com.model.pc.criteria.list;

public class OfficeExistCriteria {
	private boolean exist;
	private boolean notExist;

	public OfficeExistCriteria(boolean exist,boolean notExist) {
		this.exist = exist;
		this.notExist = notExist;
	}

	public OfficeExistCriteria() {

	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	public boolean isNotExist() {
		return notExist;
	}

	public void setNotExist(boolean notExist) {
		this.notExist = notExist;
	}

	@Override
	public String toString() {
		return "OfficeExistCriteria [exist=" + exist + ", notExist=" + notExist + "]";
	}



}
