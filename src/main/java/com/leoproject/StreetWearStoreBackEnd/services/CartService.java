package com.leoproject.StreetWearStoreBackEnd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoproject.StreetWearStoreBackEnd.entities.Cart;
import com.leoproject.StreetWearStoreBackEnd.repositories.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	public List<Cart> findAll(){
		return cartRepository.findAll();
	}
	
	public Cart findById(Integer id) {
		Optional<Cart> obj = cartRepository.findById(id);
		return obj.get();
	}
	
	
}
