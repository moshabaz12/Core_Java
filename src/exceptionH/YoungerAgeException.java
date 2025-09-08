package exceptionH;

import java.util.Scanner;

public class YoungerAgeException  extends RuntimeException {
	YoungerAgeException(String msg){
		super(msg);
	}

  
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter Your Age :");
int Age= s.nextInt();

if(Age < 18) {
	throw new YoungerAgeException("You are not eligible for voting"); //  throw case me programer risponsiber raheta hai kaam hai hai customer exception 
}else{
	System.out.println("you can vote successfully");
}
	}
	
  }
	