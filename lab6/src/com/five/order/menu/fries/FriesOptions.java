package com.five.order.menu.fries;

import com.five.order.menu.ItemEntity;

public enum FriesOptions implements ItemEntity{
	
	FIVE_GUYS("FIVE"),
	CAJUN("CAJ");

	private final String shortName;
	
	private FriesOptions(String shortName) {
		this.shortName = shortName;
	}
	
	@Override
	public String getShortName() {
		return this.shortName;
	}
	
}
