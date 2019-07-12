package com.model.pc.cpu;

import java.util.EnumMap;

public enum CPUCategory {
	intel("Intel"),
	amd("AMD"),
	other("その他");

	private String cpuCategoryName;

	private CPUCategory(String cpuCategoryName) {
		this.cpuCategoryName = cpuCategoryName;
	}



	public String getCpuCategoryName() {
		return cpuCategoryName;
	}

	public static EnumMap<CPUCategory, String> options;

	static {
		options = new EnumMap<CPUCategory, String>(CPUCategory.class);
		for(CPUCategory category : CPUCategory.values()) {
			options.put(category,category.cpuCategoryName);
		}

	}



	public static EnumMap<CPUCategory, String> getOptions() {
		return options;
	}
	
	



	public void setCpuCategoryName(String cpuCategoryName) {
		this.cpuCategoryName = cpuCategoryName;
	}



	public static void setOptions(EnumMap<CPUCategory, String> options) {
		CPUCategory.options = options;
	}



	public String getValues(){
		return CPUCategory.values().toString();
	}

}
