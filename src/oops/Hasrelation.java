package oops;

class Engine {
    void start() {
        System.out.println("Engine start ho raha hai");
    }
}

class Bus {
    Engine engine;  // Has-a relationship: Car ke paas Engine hai

    Bus() {
        engine = new Engine();  // Engine object create karte hain
    }

    void startCar() {
        engine.start();  // Engine ka function use kar rahe hain
        System.out.println("Car start ho gayi");
    }
}

public class Hasrelation {
    public static void main(String[] args) {
    	 Bus c = new  Bus();
        c.startCar();
    }
}

