package com.spoloborota.teaching.lessons.lesson10;

import com.spoloborota.teaching.lessons.lesson10.ducks.Duck;
import com.spoloborota.teaching.lessons.lesson10.ducks.MallardDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
