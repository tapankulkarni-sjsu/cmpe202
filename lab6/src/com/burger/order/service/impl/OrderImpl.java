package com.burger.order.service.impl;

import java.util.List;

import com.burger.order.service.Order;
import com.burger.order.service.PackingSlip;
import com.burger.order.service.Receipt;
import com.burger.order.service.menu.Item;

public class OrderImpl implements Order {

	private List<Item> items;
	
	@Override
	public void addMenuItem(Item item) {
		items.add(item);
	}

	@Override
	public Receipt getReceipt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackingSlip getPackingSlip() {
		// TODO Auto-generated method stub
		return null;
	}

}
