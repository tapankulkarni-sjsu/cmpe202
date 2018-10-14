package com.five.order.menu.fries;

import com.five.order.menu.PricedItemEntity;

public enum FriesSizes implements PricedItemEntity{

	LITTLE("LTL",2.79),
	REGUALAR("REG",3.39),
	LARGE("LRG",5.59);

	private final String shortName;
	private final double price;
	
	private FriesSizes(String shortName,double price) {
		this.shortName = shortName;
		this.price = price;
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
