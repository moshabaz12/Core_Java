package oops;

public class Birds {

	String name;
	int rollnum;

	public  Birds (String n, int a) {
		name = n;
		rollnum = a;
	}
	public static void main(String[]args) {
	Birds m1 = new Birds("shabaz",21);
	System.out.println("name: " + m1.name + "\nrollnum: "+ m1.rollnum);

	}

}
