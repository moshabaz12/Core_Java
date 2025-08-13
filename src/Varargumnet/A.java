package Varargumnet;

public class A {
	public static void add(int...a) {
		
		int sum=0;
		
		for (int x:a) {
			
			sum= sum+x;
		}
		
		System.out.println("hello"+sum);
	}
	
	
	
	public static void main(String[] args) {
		
   A r=new  A();
   r.add(10); r.add(10,20);
   
  
  
	
}
}