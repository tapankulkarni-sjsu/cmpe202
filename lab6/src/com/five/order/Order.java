package com.five.order;

import java.util.List;

import com.five.order.menu.Item;

public interface Order {
	
	List<Item> getItems();
	
	Receipt getReceipt();
	
	PackingSlip getPackingSlip();
	
}
