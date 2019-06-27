package com.model.pc.usecategory;

public class UseCategory {

	private UseCategoryId useCategoryId;
	private UseCategoryName useCategoryName;

	public UseCategory() {

	}
	public UseCategory(UseCategoryId useCategoryId,UseCategoryName useCategoryName) {
		this.useCategoryId = useCategoryId;
		this.useCategoryName = useCategoryName;
	}

	public UseCategoryId getUseCategoryId() {
		return useCategoryId;
	}

	public void setUseCategoryId(UseCategoryId useCategoryId) {
		this.useCategoryId = useCategoryId;
	}

	public UseCategoryName getUseCategoryName() {
		return useCategoryName;
	}

	public void setUseCategoryName(UseCategoryName useCategoryName) {
		this.useCategoryName = useCategoryName;
	}
	@Override
	public String toString() {
		return "UseCategory [useCategoryId=" + useCategoryId + ", useCategoryName=" + useCategoryName + "]";
	}



}
