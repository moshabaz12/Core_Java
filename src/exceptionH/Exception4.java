package exceptionH;

public class Exception4 {

	public static void main(String[] args) {
		try {
			int a=30,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println(e);
	
			}
		finally
		{
				
				System.out.println("i am finnnaly block");
				
			}
			
		}
		

	}


