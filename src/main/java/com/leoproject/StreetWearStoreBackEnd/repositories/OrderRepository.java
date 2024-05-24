package com.leoproject.StreetWearStoreBackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoproject.StreetWearStoreBackEnd.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
