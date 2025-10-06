package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		String name = "arkam";
		String address ="govandi";
		String email ="shabazkhan6834@gmail.com";
		String phone ="876655555555555";
		String city ="belha";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("driver class loaded successfully");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//		System.out.println("success");
	  PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
	 ps.setString(1, name);
	 ps.setString(2, address);
	ps.setString(3, email);
	 ps.setString(4, phone);
	 ps.setString(5, city);
		int i=ps.executeUpdate();
		if(i > 0) {
			System.out.println("success");
		}else {
			
			System.out.println("fail");
			
			InsertDemo fh=new InsertDemo();
			
		}
	}

}
  