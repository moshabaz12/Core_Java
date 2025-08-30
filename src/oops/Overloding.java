package oops;

class MathOperation {
    // same method name but different parameters

    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sum(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class Overloding {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        
        m.sum(10, 20);        // calls sum(int, int)
        m.sum(5.5, 6.5);      // calls sum(double, double)
        m.sum(1, 2, 3);       // calls sum(int, int, int)
    }
}
