package com.fruit.dao;

public class Fruit {
	int no;
	public String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		String printFruit = "Student [no=" + no + ", name=" + name + ", price=" + price + "]";
		return printFruit;
	}
}
