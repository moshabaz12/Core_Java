package test;
import java.util.Scanner;
interface claint{
	
	 void input();//public+abstract
     void output();//public+abstract
}
public  class  Testjava implements claint {

String name;int sal;
   public  void input() {
}
{
	Scanner r=new Scanner(System.in);
	System.out.println("enter the name:");
	name =r.nextLine();
	
	System.out.println("enter the sallery:");
	sal=r.nextInt();
}
 public void output() {
}
{
System.out.println(name+" "+sal);
}
public static void main(String[]args) {
	
	claint   c= new Testjava();
	c.input(); c.output();
}
}
	
