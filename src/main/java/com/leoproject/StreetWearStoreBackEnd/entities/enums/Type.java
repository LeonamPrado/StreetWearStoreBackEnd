package com.leoproject.StreetWearStoreBackEnd.entities.enums;

public enum Type {
	
	TSHIRT(1),
	SNEAKERS(2);
	
	private int code;
	
	private Type (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Type valueOf(int code) {
		for(Type value : Type.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Code!");
	}
	
}
