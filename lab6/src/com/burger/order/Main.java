package com.burger.order;

import java.util.ArrayList;
import java.util.List;

import com.burger.order.service.Order;
import com.burger.order.service.impl.OrderImpl;
import com.burger.order.service.menu.burger.Burger;
import com.burger.order.service.menu.burger.BurgerOptions;
import com.burger.order.service.menu.burger.BurgerToppings;
import com.burger.order.service.menu.fries.Fries;
import com.burger.order.service.menu.fries.FriesOptions;
import com.burger.order.service.menu.fries.FriesSizes;

public class Main {

	public static void main(String[] args) {
		Order order = new OrderImpl();
		Burger burger = new Burger();
		burger.setSelection(BurgerOptions.LITTLE_BACON_BURGER);
		List<BurgerToppings> toppings=new ArrayList<>();
		toppings.add(BurgerToppings.GRILLED_ONION);
		toppings.add(BurgerToppings.JALAPANO_GRILLED);
		toppings.add(BurgerToppings.TOMATO);
		toppings.add(BurgerToppings.LETTUCE);
		burger.setToppings(toppings);
		order.addMenuItem(burger);
		Fries fries = new Fries();
		fries.setSelection(FriesOptions.CAJUN);
		fries.setSize(FriesSizes.LITTLE);
		order.addMenuItem(fries);
	}
	
}
