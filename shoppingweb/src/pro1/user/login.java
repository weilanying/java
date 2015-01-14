package pro1.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.println("<html>");
			out.println("<head>");
			
				out.println("<title>达内电子商务门户</title>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
				out.println("<meta name='description' content='达内电子商务门户'>");
				out.println("<link href='css/tarena.css' rel=stylesheet>");
		              out.println("<script language='javascript' src='loginvalidate.js'>");
			       out.println("</script>");
			out.println("</head>");
			out.println("<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");
		out.println("<!-- Header Start -->");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
					out.println("<tr>");
						out.println("<td align='left' width='7%' background='images/top_bg.gif'>");
						out.println("<img src='images/logo.gif' width='286' height='58'>");out.println("</td>");
						out.println("<td width='62%' background='images/top_bg.gif'>");
						out.println("</td>");
						out.println("<td width='31%' background='images/top_bg.gif' align='right'>");out.println("<img src='images/top_r.gif' width='352' height='58' border='0'>");out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
					out.println("<tr>");
						out.println("<td background='images/dh_bg.gif' align='left' height='12'>");
							out.println("<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
								out.println("<tr>");
									out.println("<td width='5%'>");out.println("</td>");
									
		          out.println("<td width='10%'>");out.println("<a href='productList '>");out.println("<img name='Image1' border='0' src='images/index.gif' width='90' height='36'>");out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");out.println("<a href='userManage '>");out.println("<img name='Image2' border='0' src='images/reg.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");out.println("<a href='shoppingCart '>");out.println("<img name='Image4' border='0' src='images/cart.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");out.println("<a href='orderList '>");out.println("<img name='Image5' border='0' src='images/order.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");out.println("<a href='productList '>");out.println("<img name='Image6' border='0' src='images/exit.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
								out.println("</tr>");
							out.println("</table>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
					out.println("<tr>");
						out.println("<td width='65%'>");
						out.println("<br> >>欢迎访问 <b>达内电子商务门户</b>");
						out.println("</td>");
						out.println("<td width='35%' align='right'>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
				out.println("<table cellspacing='1' cellpadding='3' align='center' class='tableBorder2'>");
					out.println("<tr>");
						out.println("<td height='25' valign='middle'>");
							out.println("<img src='images/Forum_nav.gif' align='absmiddle'>");
							out.println("<a href=index.jsp>达内电子商务门户</a>用户登陆</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<br>");
				out.println("<form method='post' onsubmit='return loginvalidate(this)' action='productList '>");
				out.println("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
					out.println("<tr>");
						out.println("<td colspan='4' valign='middle' align='center' height='25' background='images/bg2.gif' width='50'>");
							out.println("<font color='#ffffff'>");
								out.println("<b>用户登陆</b>");
							out.println("</font>");
						out.println("</td>");
						
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td class=tablebody1 valign='middle' height='20' width='30%'>请输入您的用户名:");
		     					
						 out.println("</td>");
						out.println("<td class=tablebody1 valign='middle' height='20' width='80%'>");						
								out.println("<input type='text'>&nbsp;");
								out.println("<a href='userRegister '>注册新用户</a>");
						
					
						out.println("</td>");
		    
					out.println("</tr>");   
					out.println("<tr>");
						out.println("<td class=tablebody1 valign='middle' width='30%' height='25'> ");
		     			out.println("请输入您的密码:");		
						 out.println("</td>");
						out.println("<td class=tablebody1 valign='middle' width='80%'>");
				
								out.println("<input type=password>");					
						
						out.println("</td>");
		    
					out.println("</tr>");   
					
					
					out.println("<tr>");
						out.println("<td colspan='4' class=tablebody2 align='center' valign='middle' width='60%'>");
						
						
								out.println("<input  type=submit value=登陆>");
							
		     					
						 out.println("</td>");
						
		    
					out.println("</tr>");   
					
					

				out.println("</table>");
				out.println("</form>");
				out.println("<br>");
		out.println("<!-- Body End -->");
		out.println("<!-- Footer Start -->");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center' height='28'>");
					out.println("<tr>");
						out.println("<td height='17' background='images/bot_bg.gif'>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'>");
					out.println("<tr>");
						out.println("<td bgcolor='#f1f1f6' height='53' valign='center'>");
							out.println("<p align='center'>Copyright &copy;2004 - 2005<a href='http://www.tarena.com.cn'>");out.println("<b>Tarena</b>");
							out.println("<font color='red'>.com.cn</font>");
							out.println("</a>");
							out.println("</p>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
		out.println("<!-- Footer End -->");
			out.println("</body>");
			out.println("");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

	}

}
