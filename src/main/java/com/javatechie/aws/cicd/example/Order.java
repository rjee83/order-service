package com.javatechie.aws.cicd.example;

import java.io.Serializable;

public class Order implements Serializable {

	private static final long serialVersionUID = 1904678557442684599L;
	private int id;
	private String name;
	private int quantity;
	private long price;

	public Order() {
		super();
	}

	public Order(int id, String name, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
