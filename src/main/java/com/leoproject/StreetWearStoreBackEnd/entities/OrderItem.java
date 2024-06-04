package com.leoproject.StreetWearStoreBackEnd.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leoproject.StreetWearStoreBackEnd.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer qtd;
	private String size;
	private Double subTotal;
	
	
	public OrderItem() {
		
	}


	public OrderItem(Product product, Order order ,Integer qtd, String size) {
		id.setProduct(product);
		id.setCart(order);
		this.qtd = qtd;
		this.size = size;
		this.subTotal = subTotalCalc();
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getCart();
	}
	
	public void setOrder(Order cart) {
		id.setCart(cart);
	}

	public Integer getQtd() {
		return qtd;
	}


	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public Double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	public Double subTotalCalc() {
		Double unitPrice = getProduct().getPrice();
		return unitPrice * this.qtd;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}