package com.model.pc.criteria.list;

public class PCCreateAtYearCriteria {
	private Integer createAtYearFrom;
	private Integer createAtYearTo;


	public PCCreateAtYearCriteria() {
	}
	public PCCreateAtYearCriteria(Integer createAtYearFrom,Integer createAtYearTo) {
		this.createAtYearFrom = createAtYearFrom;
		this.createAtYearTo = createAtYearFrom;
	}
	public Integer getCreateAtYearFrom() {
		return createAtYearFrom;
	}
	public void setCreateAtYearFrom(Integer createAtYearFrom) {
		this.createAtYearFrom = createAtYearFrom;
	}
	public Integer getCreateAtYearTo() {
		return createAtYearTo;
	}
	public void setCreateAtYearTo(Integer createAtYearTo) {
		this.createAtYearTo = createAtYearTo;
	}
	@Override
	public String toString() {
		return "PCCreateAtYearCriteria [createAtYearFrom=" + createAtYearFrom + ", createAtYearTo=" + createAtYearTo
				+ "]";
	}


}
