package com.five.order.menu.burger;

import java.util.ArrayList;
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

	@Override
	public String printReceipt() {
		StringBuilder content = new StringBuilder(getQuantity())
				.append("\t")
				.append(selection.getShortName())
				.append("\t")
				.append(getPrice())
				.append("\n")
				.append("{{{{"+selection.getMeat().getShortName()+"}}}}")
				.append("\n");
		printTopping(content);
		return content.toString();
	}

	private void printTopping(StringBuilder content) {
		List<BurgerToppings> top = new ArrayList<>();
		List<BurgerToppings> bottom = new ArrayList<>();
		for(BurgerToppings topping:toppings) {
			if(topping.isTop()) {
				top.add(topping);
			}else {
				bottom.add(topping);
			}
		}
		for(BurgerToppings topping:top) {
			content.append(topping.getShortName()+"\n");
		}
		for(BurgerToppings topping:bottom) {
			content.append("->|"+topping.getShortName()+"\n");
		}
	}

	@Override
	public String printPacking() {
		StringBuilder content = new StringBuilder(getQuantity())
				.append("\t")
				.append(selection.getShortName())
				.append("\n");
		printTopping(content);
		content.append("{{{{"+selection.getMeat().getShortName()+"}}}}\n");
		return content.toString();
	}
	
}
