package com.capgemini.lesson14.lambda;

import java.util.function.Supplier;

public class ContructorReference {

	public static void main(String[] args) {
		
		Supplier<Item> s1 = Item::new;
		System.out.println(s1.get().getName());
		System.out.println(s1.get().getPrice());

		
	}
}
