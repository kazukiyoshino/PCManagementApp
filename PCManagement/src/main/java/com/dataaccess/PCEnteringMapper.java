package com.dataaccess;

import com.model.pc.PC;

public interface PCEnteringMapper {
	public void insertPC(PC pc);
	public void insertStorage(PC pc);
	public void insertOffice(PC pc);
}
