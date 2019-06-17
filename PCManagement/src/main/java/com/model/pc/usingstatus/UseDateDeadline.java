package com.model.pc.usingstatus;

import java.util.Date;

public class UseDateDeadline {
	private Date deadline;

	public UseDateDeadline() {

	}
	public UseDateDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	@Override
	public String toString() {
		return "UseDateDeadline [deadline=" + deadline + "]";
	}



}
