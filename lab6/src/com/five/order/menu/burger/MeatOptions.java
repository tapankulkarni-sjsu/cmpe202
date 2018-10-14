package com.five.order.menu.burger;

import com.five.order.menu.ItemEntity;

public enum MeatOptions implements ItemEntity{

	BEEF("BEEF"),
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
