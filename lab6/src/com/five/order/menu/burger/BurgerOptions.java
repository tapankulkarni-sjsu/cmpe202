package com.five.order.menu.burger;

import com.five.order.menu.PricedItemEntity;

public enum BurgerOptions implements PricedItemEntity{

	CHEESEBURGER("CHEESE",MeatOptions.HAM,7.19),
	LITTLE_BACON_BURGER("LBB",MeatOptions.BACON,5.59);
	
	private final MeatOptions meat;
	private final String shortName;
	private final double price;
	
	private BurgerOptions(String shortName,MeatOptions meatParam,double price) {
		this.shortName = shortName;
		this.meat = meatParam;
		this.price = price;
	}

	public MeatOptions getMeat() {
		return meat;
	}
	
	@Override
	public String getShortName() {
		return shortName;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
	
}
