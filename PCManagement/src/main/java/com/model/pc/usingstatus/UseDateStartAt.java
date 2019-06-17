package com.model.pc.usingstatus;

import java.util.Date;

public class UseDateStartAt {
	private Date startAt;

	public UseDateStartAt() {

	}
	public UseDateStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}
	@Override
	public String toString() {
		return "UseDateStartAt [startAt=" + startAt + "]";
	}



}

