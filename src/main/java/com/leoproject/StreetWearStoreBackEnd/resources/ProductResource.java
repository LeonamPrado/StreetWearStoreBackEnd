package com.leoproject.StreetWearStoreBackEnd.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@GetMapping
	public ResponseEntity<Product> findAll(){
		Product p = new Product(null,"t", 10.0, "t", "t", "t", "t", "t", "t", 10);
		return ResponseEntity.ok().body(p);
	}
}
