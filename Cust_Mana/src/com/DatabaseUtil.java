package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseUtil {
	
	private static final String DRIVERNAME ="com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/CustomerManager";
	private static final String USERNAME = "root";
	private static final String PASSWORD ="root";
	
	//GET A DATABASE CONNECTION 
	public static Connection getConnection(){
		
		Connection  connection = null;
		try {
			Class.forName(DRIVERNAME);
		    connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		    System.out.println("Connetion established");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return connection;
     	
	}
	public static void closeConnection(Connection con){
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void closeStatement(Statement st)
	{
		if(st != null)
		{
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public static void closePreparedStatement(PreparedStatement pst)
{
	try {
		pst.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	

}
