package com.burger.order.service.menu.fries;

import com.burger.order.service.menu.ItemEntity;

public enum FriesSizes implements ItemEntity{

	LITTLE("LTL"),
	REGUALAR("REG"),
	LARGE("LRG");

	private final String shortName;
	
	private FriesSizes(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String getShortName() {
		return shortName;
	}
	
}
