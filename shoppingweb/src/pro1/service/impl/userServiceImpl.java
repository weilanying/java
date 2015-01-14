package pro1.service.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import pro1.pojo.users;
import pro1.service.userService;

public class userServiceImpl implements userService {
	public List getUser()
	{
		List userList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from users");
			
			while(rs.next()){
				users User = new users();
				User.setpassword(rs.getString(2));
				User.setuserid(rs.getString(1));
				
				userList.add(User);
			}
		} catch (Exception e) {
			e.printStackTrace();			
			throw new RuntimeException("error when querying students ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying students ",e);
			}
		}

		return userList;		
	}

}
