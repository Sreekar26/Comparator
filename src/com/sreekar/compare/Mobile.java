package com.sreekar.compare;

public class Mobile implements Comparable<Mobile> {

	private String name;
	private int yearOfManufacture;
	private double price;

	public Mobile(String name, int year, double price) {
		this.name = name;
		this.yearOfManufacture = year;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", yearOfManufacture=" + yearOfManufacture + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Mobile mobile) {
		
		if(this.getPrice()<mobile.getPrice())
			return 1;
		else
			return -1;
	}
	
	

}
