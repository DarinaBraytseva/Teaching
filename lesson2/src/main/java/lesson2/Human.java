package lesson2;

import java.util.Date;

import lesson2.pets.Cat;
import lesson2.pets.Dog;

public class Human {
	
	boolean isAlive;
	boolean gender;		//true - man, false - woman
	short age;
	float height;		//meters
	float weight;
	float rubles;
	double dollars;
	String name;
	String bornCity;
	String livingCity;
	Date birthDay;
	
	//Pets
	Dog dog;
	Cat cat;
	
	public Human() {
	}
		
	//Constructor for newly born peoples
	public Human(short age, String name, int height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}

	static int doFitness(int hours) {
		return 0;
	}
	
	boolean isInHomeCity() {
		if (bornCity.equals(livingCity)) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean buySomething (float rubles) {
		if (this.rubles >= rubles) {
			return true;
		} else {
			return false;
		}
	}
}
