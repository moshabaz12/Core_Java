package demoText;

public class Textin {

	public void run(String name,int Distence) {
		
		
		System.out.println(name+" is running "+Distence+"km");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Textin  jumbo = new Textin();
		jumbo.run("lion",+ 14);
		jumbo.eat("buzo");		
					
		Textin Any = new  Textin();
		Any.lion("Lion",+3000);
	}
	
	public void eat(String name) {
		
		
		System.out.println(name+" is eating");
	}
	public  void lion(String name,int price) {
		
		System.out.println(name+"  "+"Price only "+price);
	}

}
