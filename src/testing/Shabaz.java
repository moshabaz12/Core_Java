package testing;

interface roman 
{
void show();
}
interface i2
{
void Display();
}
 class Shabaz implements roman , i2 
 {
	 public void show()
	 {
		 System.out.println("1");
		
	 }
	 public void Display() {
		 System.out.println("2");
	 }
	 
	 public static void main(String[]args) {
		Shabaz gh=new Shabaz();
		gh.show();gh.Display();
		 
		 
	 }
	 
	
	 }
 
 
	 
 
