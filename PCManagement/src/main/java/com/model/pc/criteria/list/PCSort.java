package com.model.pc.criteria.list;

public class PCSort {
	private SortCategory sortCategory;
	private AscOrDesc ascOrDesc;

	public PCSort() {

	}
	public PCSort(SortCategory sortCategory,AscOrDesc ascOrDesc){
		this.sortCategory = sortCategory;
		this.ascOrDesc = ascOrDesc;
	}
	public SortCategory getSortCategory() {
		return sortCategory;
	}
	public void setSortCategory(SortCategory sortCategory) {
		this.sortCategory = sortCategory;
	}
	public AscOrDesc getAscOrDesc() {
		return ascOrDesc;
	}
	public void setAscOrDesc(AscOrDesc ascOrDesc) {
		this.ascOrDesc = ascOrDesc;
	}
	@Override
	public String toString() {
		return "PCSort [sortCategory=" + sortCategory + ", ascOrDesc=" + ascOrDesc + "]";
	}



}
