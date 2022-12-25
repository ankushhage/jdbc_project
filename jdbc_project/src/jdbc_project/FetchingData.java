package jdbc_project;

import java.sql.*;

public class FetchingData
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
		
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
