package com.leoproject.StreetWearStoreBackEnd.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.leoproject.StreetWearStoreBackEnd.entities.Order;
import com.leoproject.StreetWearStoreBackEnd.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Order cart;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	

	public Order getCart() {
		return cart;
	}


	public void setCart(Order cart) {
		this.cart = cart;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cart, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(cart, other.cart) && Objects.equals(product, other.product);
	}
	
	

}
