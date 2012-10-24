package org.vhow.java.serialization;

import java.io.Serializable;

/**
 * The objects of this class are Serializable.
 */
public class Book implements Serializable {
	
	private static final long serialVersionUID = -4926781779430784702L;

	private float price;
	private String name;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
