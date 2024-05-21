package com.leoproject.StreetWearStoreBackEnd.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leoproject.StreetWearStoreBackEnd.entities.Cart;
import com.leoproject.StreetWearStoreBackEnd.services.CartService;

@RestController
@RequestMapping(value = "/cart")
public class CartResource {
	
	@Autowired
	private CartService service;
	
	@GetMapping
	public ResponseEntity<List<Cart>> findAll(){
		List <Cart> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cart> findById(@PathVariable Integer id){
		Cart p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
}
