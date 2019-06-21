package com.dataaccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.pc.PC;
import com.model.pc.PCRepository;

@Repository
public class PCDataAccess implements PCRepository {

	@Autowired
	PCMapper pcMapper;

	public List<PC> findPCAll() {
		return pcMapper.findPCAll();
	}



}
