package com.five.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.five.order.menu.Item;

public class OrderRequest {

	private List<Item> items = new ArrayList<>();
	
	public void addMenuItem(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
	
}
