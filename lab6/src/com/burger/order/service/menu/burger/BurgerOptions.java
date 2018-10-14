package com.burger.order.service.menu.burger;

import com.burger.order.service.menu.ItemEntity;

public enum BurgerOptions implements ItemEntity{

	CHEESEBURGER("CHEESE",MeatOptions.HAM),
	LITTLE_BACON_BURGER("LBB",MeatOptions.BACON);
	
	private final MeatOptions meat;
	private final String shortName;
	
	private BurgerOptions(String shortName,MeatOptions meatParam) {
		this.shortName = shortName;
		this.meat = meatParam;
	}

	public MeatOptions getMeat() {
		return meat;
	}
	
	@Override
	public String getShortName() {
		return shortName;
	}
	
}
