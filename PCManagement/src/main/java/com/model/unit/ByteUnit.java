package com.model.unit;

public enum ByteUnit {
	 MB(3),
	 GB(2),
	 TB(1);

	Integer sortBigger;


	private ByteUnit(Integer sortBigger) {
		this.sortBigger = sortBigger;
	}


	public Integer getSortBigger() {
		return sortBigger;
	}




}
