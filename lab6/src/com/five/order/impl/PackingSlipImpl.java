package com.five.order.impl;

import com.five.order.Order;
import com.five.order.PackingSlip;
import com.five.order.menu.Item;

public class PackingSlipImpl implements PackingSlip{

	private Order order;
	
	public PackingSlipImpl(Order order) {
		this.order = order;
	}

	@Override
	public String print() {
		StringBuilder content = new StringBuilder("FIVE GUYS");
		for(Item item:order.getItems()) {
			content.append(item.printPacking());
		}
		return null;
	}
	
}
