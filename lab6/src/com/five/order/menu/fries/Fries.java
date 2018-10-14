package com.five.order.menu.fries;

import com.five.order.menu.AbstractItem;
import com.five.order.menu.Item;
import com.five.order.menu.ItemType;

public class Fries extends AbstractItem {

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
		return size.getPrice()*getQuantity();
	}

	@Override
	public ItemType getType() {
		return ItemType.FRIES;
	}

	@Override
	public String printReceipt() {
		StringBuilder content = new StringBuilder(getQuantity())
				.append("\t")
				.append(size.getShortName())
				.append(" ")
				.append(selection.getShortName());
		return content.toString();
	}

	@Override
	public String printPacking() {
		StringBuilder content = new StringBuilder(getQuantity())
									.append("\t")
									.append(size.getShortName())
									.append(" ")
									.append(selection.getShortName());
		return content.toString();
	}

}
