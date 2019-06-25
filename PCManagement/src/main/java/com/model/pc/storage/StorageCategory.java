package com.model.pc.storage;

import java.util.EnumMap;

public enum StorageCategory {
	hdd("HDD"),
	ssd("SSD"),
	other("その他");

	private String storageCategoryName;

	private StorageCategory(String storageCategoryName) {
		this.storageCategoryName = storageCategoryName;
	}

	public String getStorageCategoryName() {
		return storageCategoryName;
	}

	public static EnumMap<StorageCategory, String> options;

	static {
		options = new EnumMap<StorageCategory, String>(StorageCategory.class);
		for(StorageCategory category : StorageCategory.values()) {
			options.put(category,category.storageCategoryName);
		}

	}

	public static EnumMap<StorageCategory, String> getOptions() {
		return options;
	}

	public static void setOptions(EnumMap<StorageCategory, String> options) {
		StorageCategory.options = options;
	}

	public void setStorageCategoryName(String storageCategoryName) {
		this.storageCategoryName = storageCategoryName;
	}





}
