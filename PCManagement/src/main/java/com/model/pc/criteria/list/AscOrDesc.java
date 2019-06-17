package com.model.pc.criteria.list;

public enum AscOrDesc {
  ASC("asc"),
  DESC("desc");

	private String sortAscOrDesc;

	private AscOrDesc(String sortAscOrDesc) {
		this.sortAscOrDesc = sortAscOrDesc;
	}

	public String getSortAscOrDesc() {
		return sortAscOrDesc;
	}


}

