package com.service;


import java.sql.Date;

import org.springframework.stereotype.Service;

import com.model.entered_date.EnteredDate;
import com.model.pc.createAt.PCCreateAt;

@Service
public class CreatePCcreateAtByEnteredDateService {


	public PCCreateAt createPCcreateAtByEnteredDate(EnteredDate enteredDate) {
		PCCreateAt pcCreateAt =new PCCreateAt();

		pcCreateAt.getPcCreateAtYear().setCreateAtYear(enteredDate.getYear());
		if(enteredDate.getMonth() != null && enteredDate.getDay() != null) {
			String date = enteredDate.getYear()+"-"+enteredDate.getMonth()+"-"+enteredDate.getDay();
			pcCreateAt.getPcCreateAtDate().setCreateAtDate(Date.valueOf(date));
		}

		return pcCreateAt;

	}

}

