package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitComparator implements Comparator<Fruit> {
	
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}
