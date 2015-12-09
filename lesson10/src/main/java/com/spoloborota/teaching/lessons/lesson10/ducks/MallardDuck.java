package com.spoloborota.teaching.lessons.lesson10.ducks;

import com.spoloborota.teaching.lessons.lesson10.fly.FlyWithWings;
import com.spoloborota.teaching.lessons.lesson10.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();


	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
