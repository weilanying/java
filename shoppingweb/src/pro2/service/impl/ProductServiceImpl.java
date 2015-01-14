package pro2.service.impl;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pro2.pojo.Product;
import pro2.service.ProductService;


public class ProductServiceImpl implements ProductService {
	
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
