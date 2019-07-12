package com.model.entered_date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class EnteredDate {
	@NotNull
	@Min(1990)
	@Max(2030)
	private Integer year;
	@Min(1)
	@Max(12)
	private Integer month;
	@Min(1)
	@Max(31)
	private Integer day;

	public EnteredDate() {

	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	@AssertTrue(message ="製造月と製造日はセットで入力してください")
	public boolean isSetMonthAndDay() {
		if(month==null&&day==null) {
			return true;
		}
		if(month!=null&&day!=null) {
			return true;
		}

		return false;

	}

}
