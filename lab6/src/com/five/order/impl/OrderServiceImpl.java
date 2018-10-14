package com.five.order.impl;

import com.five.order.Order;
import com.five.order.OrderRequest;
import com.five.order.OrderService;

public class OrderServiceImpl implements OrderService{

	@Override
	public Order submit(OrderRequest request) {
		Order order = new OrderImpl(request.getItems());
		return order;
	}
	
}
