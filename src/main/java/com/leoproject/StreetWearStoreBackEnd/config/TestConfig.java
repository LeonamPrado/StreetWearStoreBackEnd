package com.leoproject.StreetWearStoreBackEnd.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leoproject.StreetWearStoreBackEnd.entities.Cart;
import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.entities.ProductItem;
import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.entities.enums.Type;
import com.leoproject.StreetWearStoreBackEnd.repositories.CartRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductItemRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductItemRepository productItemRepository;
	


	@Override
	public void run(String... args) throws Exception {
		
		Product t = new Product(null,"t", 10.0, "t", "t", "t", "t", Type.SNEAKERS, "t", 10);
		Product p = new Product(null,"p", 100.0, "p", "p", "p", "p", Type.TSHIRT, "p", 100);
		Product g = new Product(null,"p", 100.0, "p", "p", "p", "p", Type.TSHIRT, "p", 100);
		productRepository.saveAll(Arrays.asList(t,p,g));
		User u1 = new User(null,"Leonam");
		User u2 = new User(null,"NotLeonam");
		Cart c = new Cart(150.00, u1);
		Cart c1 = new Cart(350.00, u2);
		cartRepository.saveAll(Arrays.asList(c,c1));
		
	
		
		
		
		ProductItem pi = new ProductItem(t,c,100,"M",100.0);
		ProductItem pi1 = new ProductItem(p,c,100,"P",50.0);
		
		productItemRepository.saveAll(Arrays.asList(pi,pi1));
		
		
		
	}
	
	
}
