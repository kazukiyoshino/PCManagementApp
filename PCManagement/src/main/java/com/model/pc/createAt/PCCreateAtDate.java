package com.model.pc.createAt;

import java.sql.Date;

public class PCCreateAtDate {

	private Date createAtDate;

	public PCCreateAtDate() {

	}

	public PCCreateAtDate(Date createAtDate) {
		this.createAtDate = createAtDate;
	}

	public Date getCreateAtDate() {
		return createAtDate;
	}

	public void setCreateAtDate(Date createAtDate) {
		this.createAtDate = createAtDate;
	}

	@Override
	public String toString() {
		return "PCCreateAtDate [createAtDate=" + createAtDate + "]";
	}




}
