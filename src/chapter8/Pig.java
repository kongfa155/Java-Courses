package chapter8;

public class Pig implements IAnimal {
	@Override
	public void animalSound() {
		System.out.println("Ec Ec");

	}

	@Override
	public void run() {
		System.out.println("I A I ACH");
	}
}
