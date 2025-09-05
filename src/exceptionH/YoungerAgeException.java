package exceptionH;

import java.util.Scanner;

public class YoungerAgeException  extends RuntimeException {
	YoungerAgeException(String msg){
		super(msg);
	}

  public class Voting {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter Your Age :");
int age= s.nextInt();

if(age < 18) {
	throw new YoungerAgeException("You are not eligible for voting");
}else{
	System.out.println("you can vote successfully");
}
	}
	
  }}
	