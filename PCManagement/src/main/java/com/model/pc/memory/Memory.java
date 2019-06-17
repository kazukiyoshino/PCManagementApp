package com.model.pc.memory;

import com.model.unit.ByteUnit;

public class Memory {
	private MemoryCapacity memoryCapacity;
	private ByteUnit byteUnit;

	public Memory() {

	}

	public Memory(MemoryCapacity memoryCapacity,ByteUnit byteUnit) {
		this.memoryCapacity = memoryCapacity;
		this.byteUnit = byteUnit;

	}

	public MemoryCapacity getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(MemoryCapacity memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public ByteUnit getByteUnit() {
		return byteUnit;
	}

	public void setByteUnit(ByteUnit byteUnit) {
		this.byteUnit = byteUnit;
	}

	@Override
	public String toString() {
		return "Memory [memoryCapacity=" + memoryCapacity + ", byteUnit=" + byteUnit + "]";
	}




}
