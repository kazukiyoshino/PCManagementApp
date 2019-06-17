package com.model.pc.criteria.list;

import com.model.pc.memory.MemoryCapacity;
import com.model.unit.ByteUnit;

public class MemoryCriteria {
	private MemoryCapacity memoryCapacity;
	private ByteUnit byteUnit;
	private SelectMoreOrLess selectMoreOrLess;


	public MemoryCriteria() {

	}
	public MemoryCriteria(MemoryCapacity memoryCapacity,ByteUnit byteUnit,SelectMoreOrLess selectMoreOrLess) {
		this.memoryCapacity = memoryCapacity;
		this.byteUnit = byteUnit;
		this.selectMoreOrLess = selectMoreOrLess;
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
	public SelectMoreOrLess getSelectMoreOrLess() {
		return selectMoreOrLess;
	}
	public void setSelectMoreOrLess(SelectMoreOrLess selectMoreOrLess) {
		this.selectMoreOrLess = selectMoreOrLess;
	}
	@Override
	public String toString() {
		return "MemoryCriteria [memoryCapacity=" + memoryCapacity + ", byteUnit=" + byteUnit + ", selectMoreOrLess="
				+ selectMoreOrLess + "]";
	}



}
