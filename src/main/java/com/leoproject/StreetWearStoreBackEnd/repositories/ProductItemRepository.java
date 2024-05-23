package com.leoproject.StreetWearStoreBackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoproject.StreetWearStoreBackEnd.entities.ProductItem;
import com.leoproject.StreetWearStoreBackEnd.entities.pk.ProductItemPK;

public interface ProductItemRepository extends JpaRepository<ProductItem, ProductItemPK> {
	
}
