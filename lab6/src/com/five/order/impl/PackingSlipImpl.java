package com.five.order.impl;

import com.five.order.Order;
import com.five.order.PackingSlip;

public class PackingSlipImpl implements PackingSlip{

	private Order order;
	
	public PackingSlipImpl(Order order) {
		this.order = order;
	}

	@Override
	public String print() {
		return null;
	}
	
}
