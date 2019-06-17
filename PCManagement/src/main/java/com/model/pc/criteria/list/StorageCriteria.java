package com.model.pc.criteria.list;

import com.model.pc.storage.StorageCapacity;
import com.model.unit.ByteUnit;

public class StorageCriteria {
	private StorageCapacity storageCapacity;
	private SelectMoreOrLess selectMoreOrLess;
	private ByteUnit byteUnit;

	public StorageCriteria() {

	}

	public StorageCriteria(StorageCapacity storageCapacity,SelectMoreOrLess selectMoreOrLess,ByteUnit byteUnit) {
		this.storageCapacity = storageCapacity;
		this.selectMoreOrLess = selectMoreOrLess;
		this.byteUnit = byteUnit;
	}

	public StorageCapacity getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(StorageCapacity storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public SelectMoreOrLess getSelectMoreOrLess() {
		return selectMoreOrLess;
	}

	public void setSelectMoreOrLess(SelectMoreOrLess selectMoreOrLess) {
		this.selectMoreOrLess = selectMoreOrLess;
	}

	public ByteUnit getByteUnit() {
		return byteUnit;
	}

	public void setByteUnit(ByteUnit byteUnit) {
		this.byteUnit = byteUnit;
	}

	@Override
	public String toString() {
		return "StorageCriteria [storageCapacity=" + storageCapacity + ", selectMoreOrLess=" + selectMoreOrLess
				+ ", byteUnit=" + byteUnit + "]";
	}



}
