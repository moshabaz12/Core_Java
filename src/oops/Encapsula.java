package oops;

class IIt {
    // private data members (hidden from outside)
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsula {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Shabaz");  // set data using method
        s.setAge(22);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
