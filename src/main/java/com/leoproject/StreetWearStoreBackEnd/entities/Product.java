package com.leoproject.StreetWearStoreBackEnd.entities;

import java.io.Serializable;
import java.util.Objects;

import com.leoproject.StreetWearStoreBackEnd.entities.enums.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double price;
	private String urlCover;
	private String urlDetail;
	private String urlDetail1;
	private String brand;
	private Integer type;
	
	public Product() {
		
	}

	public Product(Integer id, String name, Double price, String urlCover, String urlDetail, String urlDetail1,
			String brand, Type type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.urlCover = urlCover;
		this.urlDetail = urlDetail;
		this.urlDetail1 = urlDetail1;
		this.brand = brand;
		setType(type);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUrlCover() {
		return urlCover;
	}

	public void setUrlCover(String urlCover) {
		this.urlCover = urlCover;
	}

	public String getUrlDetail() {
		return urlDetail;
	}

	public void setUrlDetail(String urlDetail) {
		this.urlDetail = urlDetail;
	}

	public String getUrlDetail1() {
		return urlDetail1;
	}

	public void setUrlDetail1(String urlDetail1) {
		this.urlDetail1 = urlDetail1;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return Type.valueOf(type);
	}

	public void setType(Type type) {
		if(type != null) {
			this.type = type.getCode();
		}
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
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}	
}
