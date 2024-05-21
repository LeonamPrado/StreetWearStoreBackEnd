package com.leoproject.StreetWearStoreBackEnd.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leoproject.StreetWearStoreBackEnd.entities.Cart;
import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.entities.enums.Type;
import com.leoproject.StreetWearStoreBackEnd.repositories.CartRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Product t = new Product(null,"t", 10.0, "t", "t", "t", "t", Type.SNEAKERS, "t", 10);
		Product p = new Product(null,"p", 100.0, "p", "p", "p", "p", Type.TSHIRT, "p", 100);
		
		Cart c = new Cart(150.00);
		
		productRepository.saveAll(Arrays.asList(t,p));
		cartRepository.saveAll(Arrays.asList(c));
	}
	
	
}
