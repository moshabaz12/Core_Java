package revise;

public class ControlStatements {

	public static void main(String[] args) {
		int a= 10;// if else statements
		int b=20;
		if(a>b) {
			System.out.println("right");	
		}
		else {
			System.out.println("rong");
			
		}
		
		int marks =90;
		if( marks >90) {
			System.out.println("A");
		}else if(marks > 60 ) {
			
			System.out.println("B");
		}else if(marks > 55) {
			System.out.println("C");
		}else {
			
			System.out.println("final");
		}
		
		int day=100;
		switch(day) {
		case 1:
			System.out.println("sunday");
			
		}
	
	}

}
