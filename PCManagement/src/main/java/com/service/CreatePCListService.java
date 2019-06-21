package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataaccess.PCDataAccess;
import com.model.pc.PC;

@Service
public class CreatePCListService {

	@Autowired
	private PCDataAccess pcDataAccess;

	public List<PC> returnPCList() {
		return pcDataAccess.findPCAll();

	}

}
