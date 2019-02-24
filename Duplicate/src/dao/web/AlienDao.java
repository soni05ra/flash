package dao.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.web.Alien;
import util.web.DatabaseUtil;

public class AlienDao {
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	
	public Alien getAlient(int aid) throws ClassNotFoundException
	{
		Alien a = new Alien();
		try {
		 con = DatabaseUtil.getConnetion();
		 String query = "Select * from alien where aid = ?";
         pst = con.prepareStatement(query);
         pst.setInt(1, aid);
         rs = pst.executeQuery();
         while(rs.next())
         {
        	 a.setAid(rs.getInt(1));
        	 a.setAname(rs.getString(2));
        	 a.setTech(rs.getString(3));
         }
         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		DatabaseUtil.closePreparedStatement(pst);
		DatabaseUtil.closeConnection(con);
		}
	
		return a;
		
	}

}
