package mainmethods;

public class Main {
	
	// without parameter
	static void name() {
		int a = 10;
		System.out.println(a);
	}
	
	//method without parameter but return value
	static String cash() {
		
		return "shabaz";
	}
	// prameter without return
	static  int number(int x,int y) {
	
		int z=x+y;
		return z;
	}
	
	
	public static void main(String[]args) {
		
		name();
		
		String frog = cash();
		System.out.println(frog);
		
		int numb= number(23,45);
		System.out.println(numb);
		
		
	      int x=1; //increment
	      x++;
		System.out.println(x);
		
		char ch='a';
		ch++;
		System.out.println(ch);
		
		float sd= 50.9f;
		sd++;
		System.out.println(sd);
		
//		boolean se=true;
//		 se++;
//		 System.out.println(se);
		byte df=10;                     //convert
		byte kd=20;
		byte vc=(byte)(df+kd);
		System.out.println( vc);
		
		int we=20;                  //normal
		int sed=39;
		System.out.println(we+sed);
		
		
	}

		
		
	
}
