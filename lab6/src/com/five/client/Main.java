package com.five.client;

import java.util.ArrayList;
import java.util.List;

import com.five.order.Order;
import com.five.order.OrderRequest;
import com.five.order.OrderService;
import com.five.order.impl.OrderServiceImpl;
import com.five.order.menu.burger.Burger;
import com.five.order.menu.burger.BurgerOptions;
import com.five.order.menu.burger.BurgerToppings;
import com.five.order.menu.fries.Fries;
import com.five.order.menu.fries.FriesOptions;
import com.five.order.menu.fries.FriesSizes;

public class Main {

	public static void main(String[] args) {
		OrderRequest orderRequest = new OrderRequest();
		Burger burger = new Burger();
		burger.setSelection(BurgerOptions.LITTLE_BACON_BURGER);
		List<BurgerToppings> toppings=new ArrayList<>();
		toppings.add(BurgerToppings.GRILLED_ONION);
		toppings.add(BurgerToppings.JALAPANO_GRILLED);
		toppings.add(BurgerToppings.TOMATO);
		toppings.add(BurgerToppings.LETTUCE);
		burger.setToppings(toppings);
		orderRequest.addMenuItem(burger);
		Fries fries = new Fries();
		fries.setSelection(FriesOptions.CAJUN);
		fries.setSize(FriesSizes.LITTLE);
		orderRequest.addMenuItem(fries);
		OrderService service = new OrderServiceImpl();
		Order order = service.submit(orderRequest);
		System.out.println(order.getPackingSlip().print());
		System.out.println(order.getReceipt().print());
	}
	
}
