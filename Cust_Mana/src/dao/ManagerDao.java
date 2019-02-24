package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.DatabaseUtil;

import cust.Customer;
import manager.Manager;

public class ManagerDao {
	
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public int addCustomer(int managerID,Customer cust){
		int addFlag = 0;
		try {
		con = DatabaseUtil.getConnection();
		String query = "Insert into Customer Values(?,?,?,?,?)";
	    pst = con.prepareStatement(query);
	    pst.setInt(1,cust.getCustID());
	    pst.setString(2, cust.getCustName());
	    pst.setString(3, cust.getAccountType());
	    pst.setString(4,cust.getAccountNo());
	    pst.setInt(5, managerID);

	    int i = pst.executeUpdate();
	    if(i>0)
	    {
	    	addFlag = 1;
	    	System.out.println("Customer is added succssfully");
	    }
	    else
	    {
	    	System.out.println("Operation failed");
	    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return addFlag;
		
	}
	public boolean updateManager(Manager manger,String branch){
		boolean b = false;
		
		try {
			con = DatabaseUtil.getConnection();
			String query = "Update Manager set Branch =? Where ManagerId =?";
			pst = con.prepareStatement(query);
			pst.setString(1, branch);
			pst.setInt(2, manger.getManagerId());
			int i = pst.executeUpdate();
			if(i>0)
			{
				b = true;
				System.out.println("Manager is updated susscussfully");
			}
			else
			{
				System.out.println("Operation is failed");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return b;
		
	}
	public ArrayList<Customer> getCustomerByBranch(String branch){
		ArrayList<Customer> custList = new ArrayList<Customer>();
		
		try {
			con = DatabaseUtil.getConnection();
			String query = "Select * from Customer c,Manager m  where c.ManagerID = m.ManagerID  and m.Branch = ?";
			pst = con.prepareStatement(query);
			pst.setString(1, branch);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Customer cust = new Customer();
				cust.setCustID(rs.getInt(1));
				cust.setCustName(rs.getString(2));
				cust.setAccountType(rs.getString(3));
				cust.setAccountNo(rs.getString(4));
				custList.add(cust);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return custList;
		
	}
	public int countOfCustomer(String AccountType){
		 int i =0,a =0,count =0;
		 try {
			 con = DatabaseUtil.getConnection();
			 String query = "Select COUNT(Account_Type) From Customer where Account_Type = ?";
			 pst = con.prepareStatement(query);
			 pst.setString(1, AccountType);
			 rs = pst.executeQuery();
			 i = 1;
			 while(rs.next())
			   {
			   
			  count = rs.getInt(1);
			   }
			 System.out.println("Count is "+ count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}
	

}
