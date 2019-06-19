package com.model.account;

public interface AccountRepository
{
    public Account findByUsername(String username);
}
