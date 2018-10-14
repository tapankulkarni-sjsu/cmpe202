package com.five.order.impl;

import java.util.List;

import com.five.order.Order;
import com.five.order.PackingSlip;
import com.five.order.Receipt;
import com.five.order.menu.Item;

public class OrderImpl implements Order {

	private final List<Item> items;
	
	public OrderImpl(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	@Override
	public Receipt getReceipt() {
		return new ReceiptImpl(this);
	}

	@Override
	public PackingSlip getPackingSlip() {
		return new PackingSlipImpl(this);
	}	
	
}
