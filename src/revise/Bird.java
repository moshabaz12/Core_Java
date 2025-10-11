package revise;
class Sounds{
	void Sound() {
		System.out.println(" lion  sound ");
	}
	
}
class Bird  extends Sounds{
void Sound() {
	System.out.println(" voice ");
//	System.out.println();
}

public static void main(String[] args) {
		Sounds s= new Bird();
		
		
		s.Sound();
//		Bird b = new Bird();
//		b.Sound();
		System.out.println();
		
		
		
		
	}

}
