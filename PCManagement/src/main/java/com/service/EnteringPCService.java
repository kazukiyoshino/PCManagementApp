package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataaccess.PCEnteringDataAccess;
import com.model.pc.PC;

@Service
@Transactional
public class EnteringPCService {

	@Autowired
	PCEnteringDataAccess pcEnteringDataAccess;

	public void enteringPC(PC pc){
		pcEnteringDataAccess.enteringPC(pc);
	}

}
