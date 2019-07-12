package com.dataaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.pc.EnteringPCRepository;
import com.model.pc.PC;

@Repository
public class PCEnteringDataAccess implements  EnteringPCRepository{

	@Autowired
	PCEnteringMapper pcEnteringMapper;

	public void enteringPC(PC pc) {

		pcEnteringMapper.insertPC(pc);
		pcEnteringMapper.insertStorage(pc);
		pcEnteringMapper.insertOffice(pc);

	}



}
