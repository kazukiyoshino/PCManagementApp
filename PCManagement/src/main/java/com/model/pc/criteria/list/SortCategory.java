package com.model.pc.criteria.list;

public enum SortCategory {
	PC_id("pc_id"),
	PC_CREATE_AT("pc_create_at_year");
	private String sortCategory;

	private SortCategory(String sortCategory){
		this.sortCategory = sortCategory;
	}

	public String getSortCategory() {
		return sortCategory;
	}

}
