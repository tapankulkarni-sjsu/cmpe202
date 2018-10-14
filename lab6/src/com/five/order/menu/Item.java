package com.five.order.menu;

public interface Item {

	int getQuantity();
	
	double getPrice();

	ItemType getType();

	String printReceipt();

	String printPacking();
}
