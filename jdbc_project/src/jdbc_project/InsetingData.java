package jdbc_project;

import java.sql.*;

public class InsetingData 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "root";
		String Query = "insert into students values(6,'Sunita')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		try
		{
		int count = st.executeUpdate(Query);
		System.out.println(count + " Row affected");
		}
		catch(Exception e)
		{
			System.out.println("Already Exist");
		}
		
		st.close();
		con.close();
	}

}
