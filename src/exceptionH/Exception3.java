package exceptionH;
import java.io.FileInputStream;

public class Exception3 {

	public static void main(String[] args) {
		
		
		
		try {
			
			FileInputStream f1 = new FileInputStream("b:/abc.text");
			
			
			
		}catch(Exception ae) {
			//ae.printStackTrace();ye sab print karwata hai
			System.out.println(ae);   //ye dono  sirf Exception and  discretion
			System.out.println(ae.toString());
//			ae.printStackTrace();
			
		}
		
		
System.out.println("welcome");
	}

}
