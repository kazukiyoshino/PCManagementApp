package com.model.pc.createAt;

public class PCCreateAt {
	private PCCreateAtYear pcCreateAtYear;
	private PCCreateAtDate pcCreateAtDate;

	public PCCreateAt() {
		this.pcCreateAtYear = new PCCreateAtYear();
		this.pcCreateAtDate = new PCCreateAtDate();
	}
	public PCCreateAt(PCCreateAtYear pcCreateAtYear,PCCreateAtDate pcCreateAtDate) {
		this.pcCreateAtYear = pcCreateAtYear;
		this.pcCreateAtDate = pcCreateAtDate;
	}

	public PCCreateAtYear getPcCreateAtYear() {
		return pcCreateAtYear;
	}

	public void setPcCreateAtYear(PCCreateAtYear pcCreateAtYear) {
		this.pcCreateAtYear = pcCreateAtYear;
	}

	public PCCreateAtDate getPcCreateAtDate() {
		return pcCreateAtDate;
	}

	public void setPcCreateAtDate(PCCreateAtDate pcCreateAtDate) {
		this.pcCreateAtDate = pcCreateAtDate;
	}
	@Override
	public String toString() {
		return "PCCreateAt [pcCreateAtYear=" + pcCreateAtYear + ", pcCreateAtDate=" + pcCreateAtDate + "]";
	}


}
