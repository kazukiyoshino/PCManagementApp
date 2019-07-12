package com.model.pc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PCNote {
	@NotNull
	@Size(max = 5000)
	private String note;

	public PCNote() {

	}
	public PCNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "PCNote [note=" + note + "]";
	}



}
