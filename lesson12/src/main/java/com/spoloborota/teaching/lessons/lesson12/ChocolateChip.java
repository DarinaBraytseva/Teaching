package com.spoloborota.teaching.lessons.lesson12;

import com.spoloborota.teaching.lessons.lesson12.dessert.Cookie;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}
	public void chomp() {
		//! bite(); // Can't access bite
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
} /* Output:
	Cookie constructor
	ChocolateChip constructor
 *///:~
