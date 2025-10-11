package Practic;

class Student{
	String Name ;
	int Age;
	Student(String A,int B){
		Name = A;
		Age = B;
	}
	void show() {
		System.out.println("Name >>>------>"+Name+"=Age->>>-------->"+Age);
	}
}

public class Main {

	public static void main(String[] args) {
		Student nre = new Student("shabaz",21);
		nre.show();
	}

}
