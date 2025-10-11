package Practic;

class Animal {
	void sound () {
		System.out.println("Animal makes the sound ");
	}
}

class Dog extends Animal{
	
	void sound () {
	
	System.out.println("Dog sound ");
	}
}

public class Overriden {

	public static void main(String[] args) {
		Animal seh = new Dog();
		seh.sound();
		
		
	}

}
