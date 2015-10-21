package Databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;




public class Connectdatabasequery {
	@Test
	public void dbtest() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/test";
		String dbname="test";
		String dbdriver="com.mysql.jdbc.Driver";
		String uname="sholok7@gmail.com";
		String password="Testing7";
		Class.forName(dbdriver).newInstance();
		conn=DriverManager.getConnection(url,uname,password);
		PreparedStatement psmt=conn.prepareStatement("select * from emp where sal>1000 and deptno=20");
		
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.println(rs.getString(i));
				
			}
		}
		conn.close();
		
	}

}
