package tstpack;

import java.util.ArrayList;

import cust.Customer;
import dao.ManagerDao;
import manager.Manager;

public class TestDemo {
	
	public static void main(String args[]){
		ManagerDao dao = new ManagerDao();
     	
		Customer cust = new Customer(7,"Radhika","Saving","22392");
	
		int i = dao.addCustomer(101, cust);
		System.out.println("i  is :"+ i);
		
		Manager manger = new Manager(101,"Soni","HDFC");
		boolean b = dao.updateManager(manger,"IND");
		System.out.println("Bolean is " + b);
	
		ArrayList<Customer> custList =  dao.getCustomerByBranch("IND");
		for(Customer c:custList)
		{
		System.out.println(c.getCustID() + " "+ c.getCustName()+" "+c.getAccountType() +" "+c.getAccountNo());
		}
	   	
		 i =dao.countOfCustomer("Saving");
	}

}
