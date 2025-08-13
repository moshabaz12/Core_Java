package array;

import java.util.Arrays;

public class DurgaArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] a ={{3,4,4,5,6},{7,3,8},{342,422,5,5}};
     
     System.out.println(a[0][1]+"\n "+a[1][1]);
		
		int[] r= new int[10];
		r[0]=1;
		r[1]=2;
		r[2]=3;
		r[3]=4;
		r[4]=5;
		r[5]=6;
		r[6]=7;
		r[7]=8;
		r[8]=9;
		r[9]=-10;
		
		System.out.println(r[9]);
		int [] x; ///delecretion
		x=new int[4];//creation
		x[0]=1;// intilizition
		x[1]=3;
		System.out.println(x[1]);
		
		char[] lo= {'a','b','c'};
		System.out.println(lo[1]);
		
		String[] lk= {"s","f","i"};
		System.out.println(Arrays.toString(lk));
		int q=10;
		System.out.println(q);
		
	}}