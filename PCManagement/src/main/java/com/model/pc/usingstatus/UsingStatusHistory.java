package com.model.pc.usingstatus;

import java.util.ArrayList;

public class UsingStatusHistory {
	private ArrayList<UsingStatus> usingStatusHistory;

	public UsingStatusHistory() {

	}

	public UsingStatusHistory(ArrayList<UsingStatus> usingStatushistory) {
		this.usingStatusHistory = usingStatushistory;
	}

	public ArrayList<UsingStatus> getUsingStatusHistory() {
		return usingStatusHistory;
	}

	public void setUsingStatusHistory(ArrayList<UsingStatus> usingStatusHistory) {
		this.usingStatusHistory = usingStatusHistory;
	}

	@Override
	public String toString() {
		return "UsingStatusHistory [usingStatusHistory=" + usingStatusHistory + "]";
	}



//	public void addUsingStatusHistory(UsingStatus usingStatus) {
//		usingStatusHistory.add(usingStatus);
//	}




}
