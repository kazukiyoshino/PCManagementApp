package com.model.pc;

public class PCNote {
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
