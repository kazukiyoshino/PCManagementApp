package com.model.unit;

import java.util.EnumMap;

public enum ByteUnit {
	 tb("TB"),
	 gb("GB"),
	 mb("MB");

	String byteUnitName;


	private ByteUnit(String byteUnitName) {
		this.byteUnitName = byteUnitName;
	}

	public static EnumMap<ByteUnit, String> options;

	static {
		options = new EnumMap<ByteUnit, String>(ByteUnit.class);
		for(ByteUnit unit : ByteUnit.values()) {
			options.put(unit,unit.byteUnitName);
		}

	}

	public String getByteUnitName() {
		return byteUnitName;
	}

	public static EnumMap<ByteUnit, String> getOptions() {
		return options;
	}








}
