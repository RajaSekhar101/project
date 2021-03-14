package com.zensar.hotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`hotel`")
public class Hotel {

	// reservation fields and annotate with it's column to connect to jpa entity
	// manager

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private int id;

	@Column(name = "hotel_price")
	private int price;
	
	@Column(name = "hotel_name")
	private String name;

	// reservation super and fields constructors

	public Hotel() {
	}

	public Hotel(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	

}
