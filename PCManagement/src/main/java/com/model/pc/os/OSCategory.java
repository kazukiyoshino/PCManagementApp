package com.model.pc.os;

import java.util.EnumMap;

public enum OSCategory {
	windows("Windows"),
	mac("Mac"),
	linux("Linux"),
	other("その他");

	String osCategoryName;

	private OSCategory(String osCategoryName) {
		this.osCategoryName=osCategoryName;
	}

	public static EnumMap<OSCategory, String> options;

	static {
		options = new EnumMap<OSCategory, String>(OSCategory.class);
		for(OSCategory category : OSCategory.values()) {
			options.put(category,category.osCategoryName);
		}

	}

	public String getOsCategoryName() {
		return osCategoryName;
	}

	public static EnumMap<OSCategory, String> getOptions() {
		return options;
	}



}
