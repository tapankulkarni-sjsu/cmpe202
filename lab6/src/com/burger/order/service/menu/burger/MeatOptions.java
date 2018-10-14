package com.burger.order.service.menu.burger;

import com.burger.order.service.menu.ItemEntity;

public enum MeatOptions implements ItemEntity{

	BEEF("BEEf"),
	BACON("BACON"),
	HAM("HAM");
	
	private final String shortName;
	
	private MeatOptions(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String getShortName() {
		return shortName;
	}
	
}
