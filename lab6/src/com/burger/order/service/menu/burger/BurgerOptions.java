package com.burger.order.service.menu.burger;

public enum BurgerOptions {

	CHEESEBURGER(MeatOptions.HAM),
	LITTLE_BACON_BERGER(MeatOptions.BACON);
	
	private final MeatOptions meat;
	
	private BurgerOptions(MeatOptions meatParam) {
		this.meat = meatParam;
	}

	public MeatOptions getMeat() {
		return meat;
	}
	
}
