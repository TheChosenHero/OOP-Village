package main;

public class Dog extends Villager implements Runable{

	public Dog(String name, int age, House house, int money) {
		super(name, age, house, money);
	}

	public void move() {
		System.out.println("dog walking");		
	}

	public void talk() {
		System.out.println("Bark Bark");
	}

	public void run() {
		System.out.println("Dog running!");
	}
}
