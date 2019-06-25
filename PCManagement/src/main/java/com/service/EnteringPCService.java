package com.service;

import com.dataaccess.PCEnteringDataAccess;
import com.model.pc.PC;

public class EnteringPCService {

	PCEnteringDataAccess pcEnteringDataAccess;

	public void enteringPC(PC pc){
		pcEnteringDataAccess.insertPC(pc);
	}

}
