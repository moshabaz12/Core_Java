package oops;

  class Student {
    // Private variable, hidden from outside
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if(age > 0) { // Control access: only positive age allowed
            this.age = age;
        }
    }
}

public class Dataheid {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.setName("Shabaz"); // Access through setter
        s.setAge(25);         // Access through setter

        System.out.println("Name: " + s.getName()); // Access through getter
        System.out.println("Age: " + s.getAge());
    }
}
