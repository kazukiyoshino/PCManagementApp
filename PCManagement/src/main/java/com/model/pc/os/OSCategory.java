package com.model.pc.os;

public enum OSCategory {
	Windows(1),
	Mac(2),
	Linux(3),
	その他(4);

	Integer sortNumber;

	private OSCategory(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}

	public Integer getSortNumber() {
		return sortNumber;
	}
}
