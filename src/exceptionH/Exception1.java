package exceptionH;
import java.io.FileOutputStream;
public class Exception1 {

	public static void main(String[] args) {
		
		
		try {
			
			FileOutputStream fil =new  FileOutputStream("d:/abc.tex");//compile time  exception ya fhir check time exeption > handal karna ya report karnwana haito
		}
		catch(Exception e)
		
		
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
