package exceptionH;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite 
{
	void readFile() throws FileNotFoundException // just indicate aa sakti hai
	{
		FileInputStream fis = new FileInputStream("D:/shabaz.txt");
	}
	
	void saveFile() throws FileNotFoundException 
	{
		String txt ="this is demo";
	FileOutputStream fos = new FileOutputStream("D:/abcd.tex");
	}
	
	public static void main(String[] args) {
		ReadAndWrite f34 =new ReadAndWrite();
		try {
			f34.readFile();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
	System.out.println("welcome  to my program");
} 
	}
	



