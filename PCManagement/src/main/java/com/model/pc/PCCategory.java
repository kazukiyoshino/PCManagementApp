package com.model.pc;

import java.util.EnumMap;

public enum PCCategory {
	note("ノート"),
	desktop("デスクトップ"),
	other("その他");

	private String pcCategoryName;

	private PCCategory(String pcCategoryName) {
		this.pcCategoryName = pcCategoryName;
	}

	public String getSortNumber() {
		return pcCategoryName;
	}

	public static EnumMap<PCCategory, String> options;

	static {
		options = new EnumMap<PCCategory, String>(PCCategory.class);
		for(PCCategory category : PCCategory.values()) {
			options.put(category,category.pcCategoryName);
		}

	}

	public String getPcCategoryName() {
		return pcCategoryName;
	}

	public static EnumMap<PCCategory, String> getOptions() {
		return options;
	}


//	public PCCategory getName(String string) {
//		return PCCategory.valueOf(string);
//	}


}
