package com.model.pc.memory;

public class MemoryCapacity {
	private Integer capacity;

	public MemoryCapacity() {

	}
	public MemoryCapacity(Integer capacity) {
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
		return "MemoryCapacity [capacity=" + capacity + "]";
	}




}
