package lesson2.pets;

public class Dog {
	
	static String bark;
	static void doBark() {
		System.out.println(bark);
	}
	
	public Dog(String klichka) {
		this.klichka = klichka;
	}
	
	String klichka;
}
