package com.model.pc.usingstatus;

import com.model.pc.PCId;

public class UsingStatus {
	private UsingStatusID usingStatusID;
	private UseDateStartAt useDateStartAt;
	private UseDateDeadline useDateDeadline;
	private PCId pcId;

	public UsingStatus() {

	}
	public UsingStatus(UsingStatusID usingStatusID,
			UseDateStartAt useDateStartAt,
			UseDateDeadline useDateDeadline,
			PCId pcId) {
		this.usingStatusID = usingStatusID;
		this.useDateStartAt = useDateStartAt;
		this.useDateDeadline  = useDateDeadline;
		this.pcId = pcId;
	}

	public UsingStatusID getUsingStatusID() {
		return usingStatusID;
	}

	public void setUsingStatusID(UsingStatusID usingStatusID) {
		this.usingStatusID = usingStatusID;
	}

	public UseDateStartAt getUseDateStartAt() {
		return useDateStartAt;
	}

	public void setUseDateStartAt(UseDateStartAt useDateStartAt) {
		this.useDateStartAt = useDateStartAt;
	}

	public UseDateDeadline getUseDateDeadline() {
		return useDateDeadline;
	}

	public void setUseDateDeadline(UseDateDeadline useDateDeadline) {
		this.useDateDeadline = useDateDeadline;
	}

	public PCId getPcId() {
		return pcId;
	}
	public void setPcId(PCId pcId) {
		this.pcId = pcId;
	}
	@Override
	public String toString() {
		return "UsingStatus [usingStatusID=" + usingStatusID + ", useDateStartAt=" + useDateStartAt
				+ ", useDateDeadline=" + useDateDeadline + "]";
	}



}
