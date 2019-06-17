package com.model.pc.storage;

public enum StorageCategory {
	HDD(1),
	SSD(2),
	その他(3);

	private Integer sortNumber;

	private StorageCategory(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}

	public Integer getSortNumber() {
		return sortNumber;
	}



}
