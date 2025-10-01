package revise;

public class Text1 {

String h1= "arman";
int b= 23;// inctance variable

static int a=30;  // static variable
static String c="fuzail";

void show() {// local variable 
	String name="fraz";
	int age=21;
	System.out.println(name+"  "+age);
	System.out.println(h1+" "+b);
}

	public static void main(String[] args) {
		Text1 h3= new Text1();
		h3.show();
		System.out.println(Text1.a+" "+c);
	}

}
