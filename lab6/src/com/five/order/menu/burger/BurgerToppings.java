package com.five.order.menu.burger;

import com.five.order.menu.ItemEntity;

public enum BurgerToppings implements ItemEntity{

	LETTUCE("LETTUCE",true),
	TOMATO("TOMATO",true),
	GRILLED_ONION("G ONION",false),
	JALAPANO_GRILLED("JALA Grilled",false),
	MAYO("Mayo",false),
	KETCHUP("KETCHUP",false),
	RELISH("RELISH",true);

	private final String shortName;
	private final boolean isTop;
	
	private BurgerToppings(String shortName,boolean isTop) {
		this.shortName = shortName;
		this.isTop=isTop;
	}

	@Override
	public String getShortName() {
		return shortName;
	}

	public boolean isTop() {
		return isTop;
	}

}
