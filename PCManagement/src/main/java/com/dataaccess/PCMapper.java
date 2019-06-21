package com.dataaccess;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.pc.PC;

@Mapper
public interface PCMapper {

	public List<PC> findPCAll();
}
