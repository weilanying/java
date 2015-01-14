package pro.service.impl;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pro.pojo.Orders;
import pro.service.OrderService;


public class OrderServiceImpl implements OrderService {
	
	public Orders getorderDetail()
	{
		
		Connection conn = null;
		
		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		
		ResultSet rs = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		Orders order = new Orders();	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			stmt2 = conn.createStatement();
			stmt3 = conn.createStatement();
			
			rs = stmt.executeQuery("select * from Orders");
			String string;
			String string1;
			while(rs.next())	
			{
				string=rs.getString(4);
				string1=rs.getString(6);				
				rs2 = stmt2.executeQuery("select * from contactInfo where userid='"+string+"'");
				while(rs2.next()){				
					order.setuserid(rs2.getString(2));	
					order.setaddress(rs2.getString(7)+rs2.getString(6)+rs2.getString(5)+rs2.getString(4));
					order.setzip(rs2.getString(8));
					order.setemail(rs2.getString(9));
					order.sethomephone(rs2.getString(10));
					order.setofficephone(rs2.getString(12));
					order.setcellphone(rs2.getString(11));
				}
				rs3 = stmt3.executeQuery("select paystyle from payway where paywayid="+string1);
				while(rs3.next()){
					
					order.setpaywaystyle(rs3.getString(1));
				}
			}	
				
			
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying order ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when queryingorder ",e);
			}
		}
		return order;
           		
	}
	public List getorderList() {
		List orderList = new ArrayList();
		Connection conn = null;
		
		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		
		ResultSet rs = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			stmt2 = conn.createStatement();
			stmt3 = conn.createStatement();
			
			rs = stmt.executeQuery("select * from Orders");
			String string;
			String string1;
			
			while(rs.next()){
				Orders order = new Orders();				
			    order.setorderid(rs.getString(1));
				order.setname(rs.getString(2));
				order.setcost(rs.getString(3));
				order.setuserid(rs.getString(4));
				string=rs.getString(5);
				string1=rs.getString(6);				
				rs2 = stmt2.executeQuery("select paystyle from payway where paywayid="+string);
				while(rs2.next()){				
					order.setpaywaystyle(rs2.getString(1));				
				}
				rs3 = stmt3.executeQuery("select name from orderstatus where statusid="+string1);
				while(rs3.next()){
					order.setorderstatusname(rs3.getString(1));
				}
				orderList.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying order ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when queryingorder ",e);
			}
		}

		return orderList;
	}

	

	


}
