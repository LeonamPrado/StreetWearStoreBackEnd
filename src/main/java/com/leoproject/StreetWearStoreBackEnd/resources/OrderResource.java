package com.leoproject.StreetWearStoreBackEnd.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.leoproject.StreetWearStoreBackEnd.entities.models.OrderItemModel;
import com.leoproject.StreetWearStoreBackEnd.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
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
	public ResponseEntity<Map<String,String>> createOrdemItem(@RequestBody OrderItemModel requestBody){
		Map<String, String> response = new HashMap<>();
		response.put("status","sucess");
		orderService.handlePost(requestBody);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
