package com.leoproject.StreetWearStoreBackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByBrand(String brand);
}
