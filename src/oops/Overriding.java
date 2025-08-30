package oops;

class Common {
    void sound() {
        System.out.println("Animal sound karta hai");
    }
}

class Loin extends Animal {
    // overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog bhokta hai");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.sound();             // Dog ka sound chalega
    }
}
