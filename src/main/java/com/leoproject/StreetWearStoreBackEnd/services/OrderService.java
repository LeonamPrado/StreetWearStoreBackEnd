package com.leoproject.StreetWearStoreBackEnd.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoproject.StreetWearStoreBackEnd.entities.Order;
import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;
import com.leoproject.StreetWearStoreBackEnd.repositories.OrderRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.OrderItemRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Integer id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
	
	public void saveOrder(Order order) {
		orderRepository.saveAll(Arrays.asList(order));
	}

	public void saveOrderItem(OrderItem orderItem) {
		orderItemRepository.saveAll(Arrays.asList(orderItem));
	}
	
}
