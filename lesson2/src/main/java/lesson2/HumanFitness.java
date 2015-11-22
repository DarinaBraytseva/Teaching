package lesson2;

public class HumanFitness {
	
	static void doFitness(Human human) {
		while (true) {
			if (calcMassIndex(human.height, human.weight) > 25) {
				doCardio(human);
			} else if (calcMassIndex(human.height, human.weight) < 18.5) {
				doBaseGym(human);
			} else {
				break;
			}
		}
		System.out.println(human.name + ", you in a good form!");
	}

	static float calcMassIndex(float height, float weight) {
		float square = (float) Math.pow(height, 2);
		float result =  weight / square;
		return result;	
	}
	
	static void doCardio(Human human) {
		human.weight -= 1.0;
//		human.weight--;
		System.out.println(human.name + " weight now is " + human.weight + ".");
	}
	
	static void doBaseGym(Human human) {
		human.weight += 1.0;
//		human.weight++;
		System.out.println(human.name + " weight now is " + human.weight + ".");
	}
	
}
