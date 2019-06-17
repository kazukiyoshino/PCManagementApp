package com.model.pc.cpu;

public enum CPUCategory {
	Intel(1),
	AMD(2),
	その他(3);

	private Integer sortNumber;

	private CPUCategory(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}

	public Integer getSortNumber() {
		return sortNumber;
	}

}
