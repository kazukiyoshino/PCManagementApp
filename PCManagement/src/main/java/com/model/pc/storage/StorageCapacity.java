package com.model.pc.storage;

public class StorageCapacity {
	private Integer capacity;


	public StorageCapacity() {

	}
	public StorageCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "StorageCapacity [capacity=" + capacity + "]";
	}




}
