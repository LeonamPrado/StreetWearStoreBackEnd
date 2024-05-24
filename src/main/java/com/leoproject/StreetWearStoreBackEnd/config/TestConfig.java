package com.leoproject.StreetWearStoreBackEnd.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leoproject.StreetWearStoreBackEnd.entities.Order;
import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;
import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.entities.enums.Type;
import com.leoproject.StreetWearStoreBackEnd.repositories.OrderRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.OrderItemRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository productItemRepository;
	
	@Autowired
	private UserRepository userRepository;
	


	@Override
	public void run(String... args) throws Exception {
		
		Product t = new Product(null,"t", 10.0, "t", "t", "t", "t", Type.SNEAKERS);
		Product p = new Product(null,"p", 100.0, "p", "p", "p", "p", Type.TSHIRT);
		Product g = new Product(null,"p", 100.0, "p", "p", "p", "p", Type.TSHIRT);
		
		productRepository.saveAll(Arrays.asList(t,p,g));
		
		User u1 = new User(null,"Leonam@mail","123");
		User u2 = new User(null,"NotLeonam@mail","123");
	
		Order c = new Order(u1);
		Order c1 = new Order(u2);	

		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(c,c1));
		
	
	
		
	
		
		
		
		OrderItem pi = new OrderItem(t,c,100,"M",100.0);
		OrderItem pi1 = new OrderItem(p,c,100,"P",50.0);
		
		productItemRepository.saveAll(Arrays.asList(pi,pi1));
		
		
		
	}
	
	
}
