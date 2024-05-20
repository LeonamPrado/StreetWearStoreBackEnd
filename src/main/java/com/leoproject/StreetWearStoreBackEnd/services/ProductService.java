package com.leoproject.StreetWearStoreBackEnd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
}
