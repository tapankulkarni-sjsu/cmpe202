package com.five.order.impl;

import com.five.order.Order;
import com.five.order.Receipt;
import com.five.order.menu.Item;

public class ReceiptImpl implements Receipt {

	private Order order;

	public ReceiptImpl(Order order){
		this.order = order;
	}
	
	@Override
	public String print() {
		StringBuilder content = new StringBuilder("FIVE GUYS").append("\n\t\t\t-----Receipt------\n");
		double subtotal=0.0;
		for(Item item:order.getItems()) {
			content.append(item.printReceipt());
			subtotal+=item.getPrice();
		}
		content.append(String.format("\nsubtotal = %.2f",new Double(subtotal)));
		content.append("\n");
		return content.toString();
	}
	
	
}
