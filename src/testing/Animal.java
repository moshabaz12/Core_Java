package testing;

public interface Animal {
	
// public likhna jaroori nahi hai 
 public int MAX_AGE =130;
	//no usages
	public abstract  void eat();
	void sleep();
	public static void info() {
		
		System.out.println("this is an animal interface ");
		
	}
	public default void run() {
		System.out.println("animal is ruunig");
	}
}
