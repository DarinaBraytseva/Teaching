package lesson2.pets;

public class Cat {
	static String meow;
	String klichka;
	
	public Cat(String klichka) {
		this.klichka = klichka;
	}

	static void doMeow() {
		System.out.println(meow);
	}

}
