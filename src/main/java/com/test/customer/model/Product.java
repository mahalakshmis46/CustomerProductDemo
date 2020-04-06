package com.test.customer.model;

import javax.persistence.*;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int value;
	
	
	public Product() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

	public Product(int id, String name, int value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
