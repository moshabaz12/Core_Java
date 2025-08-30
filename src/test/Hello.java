package test;

// Simple class Hello
public class Hello {
}

// Example 1: Class extending Hello
class Test1 extends Hello {
    public static void main(String[] args) {
        int a = 777;
        System.out.println(a);
    }
}

// Interface left
interface Left {
    int x = 987; // public static final by default
}

// Interface right
interface Right {
    int x = 888;
}

// Example 2: Class implementing Left and Right
class Test2 implements Left, Right {
    public static void main(String[] args) {
        // To avoid conflict, use interface name
        System.out.println(Left.x);
        System.out.println(Right.x);
    }
}

// Example 3: Another class implementing Right and Left
class T implements Right, Left {
    public static void main(String[] args) {
        System.out.println(Right.x);
        System.out.println(Left.x);
    }
}
