package com.leoproject.StreetWearStoreBackEnd.entities.models;

import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;

public class OrderItemModel {
	
	private OrderItem orderItem;
	private Integer userId;
	
	
	public OrderItem getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(OrderItem ordemItem) {
		this.orderItem = ordemItem;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
}
