package pro1.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro1.pojo.users;
import pro1.service.userService;
import pro1.service.impl.userServiceImpl;

/**
 * Servlet implementation class userManage
 */
public class userManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			userService UserService = new userServiceImpl();
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			List userlist =UserService.getUser();

			toUserList(response,userlist);
		} catch (Exception e){
			toError(response,e.getMessage());
			
		}
	}
	private void toUserList(HttpServletResponse resp, List userList)
			throws IOException {	
		resp.setContentType("text/html;charset=UTF-8");		
		PrintWriter out=resp.getWriter();
		out.print("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.print("<html>");
		out.print("	<head>");
		out.print("		<title>达内电子商务门户</title>");
		out.print("		<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("		<meta name='description' content='达内电子商务门户'>");
		out.print("		<link href='css/tarena.css' rel=stylesheet>");
		out.print("	</head>");
		out.print("	<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");
		out.print("");
		out.print("<!-- Header Start -->");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
		out.print("			<tr>");
		out.print("				<td align='left' width='7%' background='images/top_bg.gif'><img src='images/logo.gif' width='286' height='58'></td>");
		out.print("				<td width='62%' background='images/top_bg.gif'>　</td>");
		out.print("				<td width='31%' background='images/top_bg.gif' align='right'><img src='images/top_r.gif' width='352' height='58' border='0'></td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.print("");
		out.print("			<tr>");
		out.print("				<td background='images/dh_bg.gif' align='left' height='12'>");
		out.print("					<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("						<tr>");
		out.print("							<td width='5%'></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='productList'><img name='Image1' border='0' src='images/index.gif' width='90' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='userManage'><img name='Image2' border='0' src='images/reg.gif' width='92' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='shoppingCart'><img name='Image4' border='0' src='images/cart.gif' width='92' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='orderList'><img name='Image5' border='0' src='images/order.gif' width='92' height='36'></a></td>");
		out.print("");
		out.print("							");
		out.print("          <td width='10%'><a href='productList'><img name='Image6' border='0' src='images/exit.gif' width='92' height='36'></a></td>");
		out.print("						</tr>");
		out.print("					</table>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
		out.print("			<tr>");
		out.print("				<td width='65%'><br>");
		out.print("");
		out.print("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.print("				</td>");
		out.print("				<td width='35%' align='right'>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("</html>");
		out.print("<!-- Header End -->");
		out.print("<!-- Body Start -->");
		out.print("<form method='post' name='reg'  action='/ecport/user/modify.do'>");
		out.print("	<input type='hidden' name='userid' value='admin'/>");
		out.print("");
		out.print("	<input type='hidden' name='contactid' value='1'/>");
		out.print("		<table cellspacing='1' cellpadding='3' align='center' class='tableBorder2'>");
		out.print("");
		out.print("			<tr>");
		out.print("				<td height='25' valign='middle'>");
		out.print("					<img src='images/Forum_nav.gif' align='absmiddle'>");
		out.print("					<a href=index.jsp>达内电子商务门户</a> →用户列表");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<br>");
		out.print("		<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
		out.print("			<tr>");
		out.print("				<td valign='middle' align='center' height='25' background='images/bg2.gif' width='35%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>用户名</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='images/bg2.gif' width='35%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>密码</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='images/bg2.gif' width='30%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>操作</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("			</tr>");
		
		for(Iterator<users> it = userList.iterator();it.hasNext();)
		{
		
		users user = it.next();
		out.print("			<tr>");
		out.print("				<td class=tablebody2 valign='middle' align='center' height='25'  width='35%'>");
		out.print("					");
		out.print("	<b>"+user.getuserid()+"</b>");	
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' height='25'  width='35%'>");
		out.print("					");
		
		out.print("	<b>"+user.getpassword()+"</b>");	
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' height='25'  width='35%'>");
		out.print("					");
		out.print("						<input type='button' value='修改' onclick='javascript:window.location='userModify';' /> ");
		out.print("						<input type='button' value='删除' disabled='disabled' />");
		out.print("				</td>				");
		out.print("			</tr>");
		
		}
		
		
	
		out.print("</form>");
		out.print("<html>");
		out.print("	<body>");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center' height='28'>");
		out.print("		  <tr>");
		out.print("");
		out.print("		    <td height='17' background='/ecport/images/bot_bg.gif'></td>");
		out.print("		  </tr>");
		out.print("		</table>");
		out.print("		");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("		  <tr>");
		out.print("		    <td bgcolor='#f1f1f6' height='53' valign='center'>");
		out.print("			<p align='center'>");
		out.print("				Copyright &copy;2004 - 2005 <a href='http://www.tarena.com.cn'>");
		out.print("");
		out.print("				<b><font face='Verdana,'>Tarena</font></b>");
		out.print("				<font color=#CC0000>.com.cn</font>");
		out.print("			</a></p><br>");
		out.print("		    </td>");
		out.print("		  </tr>");
		out.print("		</table>");
		out.print("	</body>");
		out.print("</html>");

		out.close();
	}
		
	private void toError(HttpServletResponse resp, String message) throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Error</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h2 align=\"center\">Error</h2>");
		out.println("	<hr>");
		out.println("	System Error," + message + "!");
		out.println("</body>");
		out.println("</html>");		
		out.close();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
