package polymorp;

public class Polymorp {
	
	public static void main(String[]args) {
		
		P s1 = new P();
		s1.main();
		s1.main(10);
		
	}
	void main(int a) {
		
		
		System.out.println("helllo java" + a);
		
	}
}
class P extends Polymorp{
	
	void main() {
		
		
		System.out.println("java. hello");
	}
	


}