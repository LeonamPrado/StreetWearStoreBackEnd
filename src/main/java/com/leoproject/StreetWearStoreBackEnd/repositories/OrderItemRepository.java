package com.leoproject.StreetWearStoreBackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoproject.StreetWearStoreBackEnd.entities.OrderItem;
import com.leoproject.StreetWearStoreBackEnd.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
