
package loops;



public class Forloop {



	public static void main(String[] args) {

		for (int I=0; I<=5; I++) {

			System.out.println(I);

		}

		

		//for even number

		for (int I = 2; I<=20; I=I+2) {

			System.out.println(I);

		}

		

		

		

		//for sum of numbers

		int sum = 0;

		for (int I=1; I<=5; I++) {

			sum = sum + I;

		}

		System.out.println(sum);

		

		

		

		//Enhanced for loop

		int number [] = {1,2,3,4,5,6,7,8,9};

		

		for (int i: number) {

			System.out.println(i);

		}

		

		

		//real life example

		for (int I = 3; I <= 30; I+=3) {

			System.out.println(I);

		}

		/*When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop

		 */

		 


        for( int i=2; i<=100;i*=2) {
        	
        	System.out.println(i);
        }
	}



}