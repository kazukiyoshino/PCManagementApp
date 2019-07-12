package com.model.pc.storage;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class StorageCapacity {
	@NotNull
	@Min(1)
	@Max(999)
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
