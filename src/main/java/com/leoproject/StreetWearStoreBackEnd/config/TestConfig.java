package com.leoproject.StreetWearStoreBackEnd.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Product t = new Product(null,"t", 10.0, "t", "t", "t", "t", "t", "t", 10);
		Product p = new Product(null,"p", 100.0, "p", "p", "p", "p", "p", "p", 100);
		
		productRepository.saveAll(Arrays.asList(t,p));
	}
	
	
}
