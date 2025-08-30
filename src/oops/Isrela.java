package oops;

class Animal {
    void sound() {
        System.out.println("Animal sound karta hai");
    }
}

class Dog extends Animal {
    // overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog bhokta hai");
    }
}

public class Isrela {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.sound();             // Dog ka sound chalega
    }
}
