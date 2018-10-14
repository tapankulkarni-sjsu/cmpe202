package com.five.order.impl;

import com.five.order.Order;
import com.five.order.Receipt;

public class ReceiptImpl implements Receipt {

	private Order order;

	public ReceiptImpl(Order order){
		this.order = order;
	}
	
	@Override
	public String print() {
		order.getItems();
		return null;
	}
	
	
}
