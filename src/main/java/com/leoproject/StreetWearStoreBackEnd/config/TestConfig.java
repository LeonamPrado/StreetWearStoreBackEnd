package com.leoproject.StreetWearStoreBackEnd.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.entities.enums.Type;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;
import com.leoproject.StreetWearStoreBackEnd.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Autowired
	private UserRepository userRepository;
	


	@Override
	public void run(String... args) throws Exception {
		
		Product a = new Product(null, "Nike Dunk Light Carbon",900.0,"images/cover/nikeShoes1.png","images/detail/nikeShoes1.webp","images/detail/nikeShoes1Zoom.webp","nike",Type.SNEAKERS );
		Product b = new Product(null,"Nike Dunk Valentines Day", 750.0,"images/cover/nikeShoes2.png","images/detail/nikeShoes2.webp","images/detail/nikeShoes2Zoom.webp","nike",Type.SNEAKERS);
		Product c = new Product(null,"Nike Jordan Yellow Ochre",1600.0,"images/cover/nikeShoes3.png","images/detail/nikeShoes3.webp","images/detail/nikeShoes3Zoom.webp","nike",Type.SNEAKERS);
		Product d = new Product(null, "Nike Jordan Distresses Grey", 1200.0, "images/cover/nikeShoes4.png", "images/detail/nikeShoes4.webp", "images/detail/nikeShoes4Zoom.webp", "nike", Type.SNEAKERS);
		Product e = new Product(null, "Nike Cortez Valentines Day", 600.0, "images/cover/nikeShoes5.png", "images/detail/nikeShoes5.webp", "images/detail/nikeShoes5Zoom.webp", "nike", Type.SNEAKERS); 
		Product	f = new Product(null, "Nike Dunk Miami Dolphins", 900.0, "images/cover/nikeShoes6.png", "images/detail/nikeShoes6.webp", "images/detail/nikeShoes6Zoom.webp", "nike", Type.SNEAKERS);
		Product	g = new Product(null, "Vans Ultrarange", 800.0, "images/cover/vansShoes1.png", "images/detail/vansShoes1.webp", "images/detail/vansShoes1Zoom.webp", "vans", Type.SNEAKERS);
		Product h = new Product(null, "Vans Old Skool Pro", 450.0, "images/cover/vansShoes2.png", "images/detail/vansShoes2.webp", "images/detail/vansShoes2Zoom.webp", "vans", Type.SNEAKERS);
		Product	i = new Product(null, "Vans X Hockey Skate", 300.0, "images/cover/vansShoes3.png", "images/detail/vansShoes3.webp", "images/detail/vansShoes3Zoom.webp","vans", Type.SNEAKERS);
		Product	j = new Product(null, "Vans X Breana Geering", 350.0, "images/cover/vansShoes4.png", "images/detail/vansShoes4.webp", "images/detail/vansShoes4Zoom.webp", "vans", Type.SNEAKERS);
		Product k = new Product(null, "Vans Old Skoolform", 400.0, "images/cover/vansShoes5.png", "images/detail/vansShoes5.webp", "images/detail/vansShoes5Zoom.webp", "vans", Type.SNEAKERS);
		Product l = new Product(null, "Vans Skate Sk8 Hi", 500.0, "images/cover/vansShoes6.png", "images/detail/vansShoes6.webp", "images/detail/vansShoes6Zoom.webp",  "vans", Type.SNEAKERS);
	    Product	m = new Product(null, "Adidas Adimatic", 700.0, "images/cover/adidasShoes1.png", "images/detail/adidasShoes1.webp", "images/detail/adidasShoes1Zoom.webp",  "adidas", Type.SNEAKERS);
		Product n = new Product(null, "Adidas Busenitz X Dan Mancina", 500.0, "images/cover/adidasShoes2.png", "images/detail/adidasShoes2.webp", "images/detail/adidasShoes2Zoom.webp",  "adidas", Type.SNEAKERS);
		Product	o = new Product(null, "Adidas Samba Adv X F.a", 800.0, "images/cover/adidasShoes3.png", "images/detail/adidasShoes3.webp", "images/detail/adidasShoes3Zoom.webp",  "adidas", Type.SNEAKERS);
		Product	p = new Product(null, "Adidas Adi 2000", 750.0, "images/cover/adidasShoes4.png", "images/detail/adidasShoes4.webp", "images/detail/adidasShoes4Zoom.webp",  "adidas", Type.SNEAKERS);
		Product q = new Product(null, "Adidas X Dime Busenitz Vulc", 400.0, "images/cover/adidasShoes5.png", "images/detail/adidasShoes5.webp", "images/detail/adidasShoes5Zoom.webp",  "adidas", Type.SNEAKERS);
		Product	r = new Product(null, "Adidas Lwst", 550.0, "images/cover/adidasShoes6.png", "images/detail/adidasShoes6.webp", "images/detail/adidasShoes6Zoom.webp",  "adidas", Type.SNEAKERS);
		Product	s = new Product(null, "Ripndip Dont Trip", 300.0, "images/cover/ripdipShirt1.png", "images/detail/ripdipShirt1.webp", "images/detail/ripdipShirt1Zoom.webp",  "ripndip", Type.TSHIRT);
		Product t = new Product(null, "Ripndip Good Life", 250.0, "images/cover/ripdipShirt2.png", "images/detail/ripdipShirt2.webp", "images/detail/ripdipShirt2Zoom.webp",  "ripndip", Type.TSHIRT);
		Product	u = new Product(null, "Ripndip Runaway", 225.0, "images/cover/ripdipShirt3.png", "images/detail/ripdipShirt3.webp", "images/detail/ripdipShirt3Zoom.webp",  "ripndip", Type.TSHIRT);
		Product	v = new Product(null, "Primitive X Marvel Carnage", 250.0, "images/cover/primitiveShirt1.png", "images/detail/primitiveShirt1.webp", "images/detail/primitiveShirt1Zoom.webp", "primitive", Type.TSHIRT);
		Product w = new Product(null, "Primitive X Marvel Deapool White", 250.0, "images/cover/primitiveShirt2.png", "images/detail/primitiveShirt2.webp", "images/detail/primitiveShirt2Zoom.webp",  "primitive", Type.TSHIRT);
	    Product	x = new Product(null, "Primitive X Marvel Deapool Black", 300.0, "images/cover/primitiveShirt3.png", "images/detail/primitiveShirt3.webp", "images/detail/primitiveShirt3Zoom.webp",  "primitive", Type.TSHIRT);


		productRepository.saveAll(Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x));
		
		User u1 = new User(null,"Leonam@mail","123");
		User u2 = new User(null,"NotLeonam@mail","123");
	
		

		
		userRepository.saveAll(Arrays.asList(u1,u2));

			
		
	}
	
	
}
