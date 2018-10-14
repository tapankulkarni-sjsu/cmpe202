package com.five.order.menu.burger;

import java.util.List;

import com.five.order.menu.AbstractItem;
import com.five.order.menu.ItemType;

public class Burger extends AbstractItem{

	private BurgerOptions selection;
	List<BurgerToppings> toppings;

	public BurgerOptions getSelection() {
		return selection;
	}

	public void setSelection(BurgerOptions selection) {
		this.selection = selection;
	}

	public List<BurgerToppings> getToppings() {
		return toppings;
	}

	public void setToppings(List<BurgerToppings> toppings) {
		this.toppings = toppings;
	}

	@Override
	public double getPrice() {
		return selection.getPrice()*getQuantity();
	}

	@Override
	public ItemType getType() {
		return ItemType.BURGER;
	}
	
}
