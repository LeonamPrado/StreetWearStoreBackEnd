package com.leoproject.StreetWearStoreBackEnd.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leoproject.StreetWearStoreBackEnd.entities.pk.ProductItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product_item")
public class ProductItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductItemPK id = new ProductItemPK();
	
	private Integer qtd;
	private String size;
	private Double subTotal;
	
	
	public ProductItem() {
		
	}


	public ProductItem(Product product, Cart cart ,Integer qtd, String size, Double subTotal) {
		id.setProduct(product);
		id.setCart(cart);
		this.qtd = qtd;
		this.size = size;
		this.subTotal = subTotal;
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	@JsonIgnore
	public Cart getCart() {
		return id.getCart();
	}
	
	public void setCart(Cart cart) {
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
		ProductItem other = (ProductItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
