package com.leoproject.StreetWearStoreBackEnd.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leoproject.StreetWearStoreBackEnd.entities.Order;
import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;
import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.entities.models.OrderItemModel;
import com.leoproject.StreetWearStoreBackEnd.services.OrderService;
import com.leoproject.StreetWearStoreBackEnd.services.UserService;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	

	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List <Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order p = orderService.findById(id);
		return ResponseEntity.ok().body(p);
	}
	
	@PostMapping
	public ResponseEntity<String> createOrdemItem(@RequestBody OrderItemModel requestBody){
		User user = userService.findById(requestBody.getUserId());
		Order order = new Order(user);
		orderService.saveOrder(order);
		OrderItem requestItem = requestBody.getOrderItem();
		OrderItem orderItem = new OrderItem(requestItem.getProduct(),order,requestItem.getQtd(),requestItem.getSize(),requestItem.getSubTotal());
		orderService.saveOrderItem(orderItem);
		
		return new ResponseEntity<>("Requisição POST recebida com sucesso", HttpStatus.OK);
	}
}
