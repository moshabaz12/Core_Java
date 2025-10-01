package revise;

public class Opreators {

	void show() {
	                          	//ArithMatic Operators
		int a = 10;
		int b = 20;
		int c= a+b; // addition 
		
		int d= 10;
		int e= 9;
		int f= d-e; // subtraction
		
		int aa= 10;
		int bb= 2;
		int cc=aa*bb;// multiplction
		
		int aaa= 10;  //division
		int bbb=5;
		int ccc = aaa/bbb;
		
		int aaaa= 10; // modules
		int bbbb= 20;
		int cccc=aaaa%bbbb;
		
		
		System.out.println(cccc);
		System.out.println(ccc);
		System.out.println(cc);
		System.out.println(c);
		System.out.println(f);
                       //		Assingment Operator
		int x;
		x=100; //addition 
		x+=50;// addition
		x-=50;// subtraction
		x*=2;// multiplction
		x/=10; // division
		x %=200;// modules
		System.out.println(x);
//		  relational operator
		
		int kl;
		int lk;
		
		kl=10;
		lk=10;
//		System.out.println(kl==lk);
//		System.err.println(kl<lk);
//		System.out.println(kl>lk);
//		System.out.println(kl>=lk);
//		System.out.println(kl<=lk);
//		System.out.println(kl!=lk);
		
		// logical operator in java 
		int x1;
		int x2;
		x1=10;
		x2=20;
		
		System.out.println(x1 > 5 && x2 >90);
		System.out.println(x1 > 5||x2 >10);
		System.out.println(!(x1 >10));
		
		// unary operator in java 
		
		 int x3;
		 x3=10;
		 x3++;// increment operator in java 
		 x3--;// decrement operator in java 
		 System.out.println(x3);
//		 System.out.println(--x3);
		 
		 
		 
//		 Ternary operator in java 
		 int r=100, s=20;
		 int max =(r > s) ? r : s; // max value return karta hai
		 System.out.println("Maximum value is :"+ max);
		 
		
		 
//		 int xc = 10, xxc=20;
//		 int high = (xc > xxc)? xc : xxc;
//		 System.out.println("max value returnn: "+high);
		 int sx =30, sx1=4500;
		 int High = (sx > sx1)? sx : sx1;
		 System.out.println("max value return :"+High);
	}
	public static void main(String[] args) {
		Opreators h2 = new Opreators();
		h2.show();
	}

}
