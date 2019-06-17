package com.model.pc.criteria.list;

public enum SelectMoreOrLess {
	MORE(">="),
	LESS("<=");

	private String symbol;

	private SelectMoreOrLess(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}



}
