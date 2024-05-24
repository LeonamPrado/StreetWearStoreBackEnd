package com.leoproject.StreetWearStoreBackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;
import com.leoproject.StreetWearStoreBackEnd.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll(){
		return orderItemRepository.findAll();
	}
	
}
