package com.model.pc.storage;

import com.model.unit.ByteUnit;

public class Storage {
	private StorageCapacity storageCapacity;
	private StorageCategory storageCategory;
	private ByteUnit byteUnit;

	public Storage() {

	}
	public Storage(StorageCapacity storageCapacity,StorageCategory storageCategory, ByteUnit byteUnit) {
		this.byteUnit = byteUnit;
	}

	public StorageCapacity getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(StorageCapacity storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public StorageCategory getStorageCategory() {
		return storageCategory;
	}

	public void setStorageCategory(StorageCategory storageCategory) {
		this.storageCategory = storageCategory;
	}

	public ByteUnit getByteUnit() {
		return byteUnit;
	}

	public void setByteUnit(ByteUnit byteUnit) {
		this.byteUnit = byteUnit;
	}
	@Override
	public String toString() {
		return "Storage [storageCapacity=" + storageCapacity + ", storageCategory=" + storageCategory + ", byteUnit="
				+ byteUnit + "]";
	}



}
