package Practic;

public class Overloding {

	void add(int a, int b) {
		System.out.println("Sum : " +(a+b));
	}
	
	void add(String a) {
		System.out.println("Name : "+a);
	}
	void add(int b) {
		System.out.println("Sum : "+ b);
	}
	
	public static void main(String[] args) {
		
Overloding se =new Overloding();
se.add(10,20);
se.add(30);
se.add("shabaz");
	}
}
