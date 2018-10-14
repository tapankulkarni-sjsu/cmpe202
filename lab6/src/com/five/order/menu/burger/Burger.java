package com.five.order.menu.burger;

import java.util.List;

import com.five.order.menu.Item;

public class Burger implements Item{

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
		return selection.getPrice();
	}
	
}
