package com.model.pc.memory;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MemoryCapacity {
	@NotNull
	@Min(1)
	@Max(999)
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
