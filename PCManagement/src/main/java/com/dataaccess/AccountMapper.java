package com.dataaccess;

import org.apache.ibatis.annotations.Mapper;

import com.model.account.Account;

@Mapper
public interface AccountMapper
{
	public Account findByUsername(String username);
}
