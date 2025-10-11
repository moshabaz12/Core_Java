package Practic;

public class P_construtor {
	String name;
	int age;
	P_construtor(String b ,int a){
		name = b;
		age =a;
	}
	void show() {
		System.out.println("firstName :"+ name+"age :"+ age);
	}
	public static void main(String[] args) {
		P_construtor nrr= new P_construtor("shabaz",21);
nrr.show();
	}

}
