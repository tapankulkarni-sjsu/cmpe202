package com.burger.order.service.menu.fries;

import com.burger.order.service.menu.ItemEntity;

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
