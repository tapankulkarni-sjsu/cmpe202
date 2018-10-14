package com.five.order.menu.fries;

import com.five.order.menu.Item;

public class Fries implements Item {

	private FriesOptions selection;
	private FriesSizes size;

	public FriesOptions getSelection() {
		return selection;
	}

	public void setSelection(FriesOptions selection) {
		this.selection = selection;
	}

	public FriesSizes getSize() {
		return size;
	}

	public void setSize(FriesSizes size) {
		this.size = size;
	}

	@Override
	public double getPrice() {
		return size.getPrice();
	}

}
