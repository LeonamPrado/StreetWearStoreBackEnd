package com.leoproject.StreetWearStoreBackEnd.entities.models;

import java.io.Serializable;
import java.util.List;


import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;

public class OrderItemModel  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<OrderItem> orderItem;
	private Integer userId;
	
	
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
}
