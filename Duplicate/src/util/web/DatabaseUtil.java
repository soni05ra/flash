package util.web;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class DatabaseUtil {
	
	private static final String DRIVERNAME ="com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/alien";
	private static final String USERNAME ="root";
	private static final String PASSWORD ="root";
	
	public static Connection getConnetion()
	{
		Connection connection = null;
		try {
			Class.forName(DRIVERNAME);
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
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
   public static void closePreparedStatement(PreparedStatement pst){
		  if(pst != null)
		  {
			  try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		 
	   }
   public static void Statement(Statement st){
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
   
 }
