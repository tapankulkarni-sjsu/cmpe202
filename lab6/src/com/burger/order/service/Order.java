package com.burger.order.service;

import com.burger.order.service.menu.Item;

public interface Order {

	void addMenuItem(Item item);
	
	Receipt getReceipt();
	PackingSlip getPackingSlip();
	
}
