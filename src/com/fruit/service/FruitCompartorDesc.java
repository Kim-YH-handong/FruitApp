package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitCompartorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
}
