package exceptionH;



 public class Exception5 {

	public static void main(String[] args)
	{
		Exception5 f3=new Exception5();
		f3.Divide();
		System.out.println("hello");
	}
	void  Divide()
	{
		try  
		
		{
		int a=30,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		
		catch(Exception e)
		
		{
			
		e.printStackTrace();	
		}
	}
}