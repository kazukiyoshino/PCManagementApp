package com.model.pc;

public enum PCCategory {
	ノート(1),
	デスクトップ(2),
	その他(3);

	private Integer sortNumber;

	private PCCategory(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}

	public Integer getSortNumber() {
		return sortNumber;
	}


}
