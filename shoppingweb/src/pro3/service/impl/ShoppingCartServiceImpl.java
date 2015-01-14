package pro3.service.impl;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pro2.pojo.Product;
import pro3.service.ShoppingCartService;
import pro3.pojo.ShoppingCart;




public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	public ShoppingCart getshoppingCart()
	{
		
		ShoppingCart shoppingcart = new ShoppingCart();	
		
		Connection conn = null;
		
		Statement stmt = null;
		Statement stmt1 = null;
		Statement stmt2 = null;
		
		ResultSet rs = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String string;
		String string2;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			stmt1 = conn.createStatement();
			stmt2 = conn.createStatement();
			
			
			rs = stmt.executeQuery("select * from orders");
			
			while(rs.next()){
						
				string = rs.getString(1);
				string2=rs.getString(2);
				rs1 = stmt1.executeQuery("select amount,productid from orderline where orderid="+string);
				
				while(rs1.next()){
					
				shoppingcart.setamount(rs1.getString(1));
				
				}
				rs2 = stmt2.executeQuery("select name,basePrice from product where productid="+string2);	
				while(rs2.next())
				{
					shoppingcart.setname(rs2.getString(1));
					shoppingcart.setbasePrice(rs2.getString(2));
				}
																	
				
			
			}}
		   catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying product ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying product ",e);
			}
		}

		return shoppingcart;
	}

	public List getProductList() {
		List productList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from Product");
			
			while(rs.next()){
				Product product = new Product();
				
				product.setproductid(rs.getString(1));
				product.setname(rs.getString(2));
				product.setdescription(rs.getString(3));
				product.setbasePrice(rs.getString(4));
				product.setcategoryid(rs.getString(5));
				
				product.setauthor(rs.getString(6));
				product.setpublish(rs.getString(7));
				product.setpages(rs.getString(8));
				product.setimages(rs.getString(9));
								
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying product ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying product ",e);
			}
		}

		return productList;
	}


	
	

	

}
