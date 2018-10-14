package com.burger.order.service.menu.burger;

import com.burger.order.service.menu.ItemEntity;

public enum BurgerToppings implements ItemEntity{

	LETTUCE("LETTUCE"),
	TOMATO("TOMATO"),
	GRILLED_ONION("G ONION"),
	JALAPANO_GRILLED("JALA Grilled"),
	MAYO("Mayo"),
	KETCHUP("KETCHUP"),
	RELISH("RELISH");

	private final String shortName;
	
	private BurgerToppings(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String getShortName() {
		return shortName;
	}

}
