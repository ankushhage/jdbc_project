package jdbc_project;

import java.sql.*;

public class FetchingData1
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "root";
		String Query = "Select * from aliens.students";
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		
		String userdata;
		
		rs.next();
		userdata = rs.getString(1) + " : " + rs.getString(2);
		System.out.println(userdata);
		
		rs.next();
		userdata = rs.getString(1) + " : " + rs.getString(2);
		System.out.println(userdata);
		
		st.close();
		con.close();
	}

}
