package array;
public class Array {

	public static void main(String[] args) {
		
		//normal using array also called 1d(one dimensional) through creating object
		int[] mrk = new int [4];
		
		mrk [0] = 1;
		mrk [1] = 2;
		mrk [2] = 3;
		mrk [3] = 4;
		
		System.out.println(mrk[0]);
		System.out.println(mrk[1]);
		System.out.println(mrk[2]);
		
		//print in single line
		System.out.println(mrk[0]+""+mrk[1]+mrk[2]);
		
		
		//print single value in single line 
		String[] srk = {"shahrukh khan"};
		System.out.println(srk[0]);
		
		//print multiple value / Access the Elements of an Array
		String[] sk = {"Salman","khan"};
		System.out.println(sk[0]+" "+sk[1]);
		System.out.println(sk.length);
		
		int [] p= {2,3,4,5,7};
		int [] x=p;
		System.out.println(x[1]);
		
		char a='s';
		int cx=a;
		System.out.println(cx);
		
		
		for( int i=0; i<=args.length; i++){
			
			System.out.println(args[i]);	
			
		}
for( int i=0; i<=3;i++){
			
			System.out.println(i);	
			
			String[] argh= {"a","b","c"};
			args= argh;
	           for(String s: args ){
	        	   
	        	   System.out.println(s);
	           }
			
		}
//print of 1 daimentional array
int[] pq = {10, 20, 30, 40, 78};
for (int pq2 : pq) {   // ✅ abhi pq array ka naam sahi use kiya
    System.out.println(pq2);
}

		}
			
		
	}


 /*
 array are used to store multiple value in a single variable  /  array is collection of similar type of data store into contagious memory location
 

Why use Arrays?
To store multiple values in one variable.
To handle a fixed number of elements efficiently.
 */