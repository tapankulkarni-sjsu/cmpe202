package com.five.order.menu;

public abstract class AbstractItem implements Item{

	private int quantity=1;;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
