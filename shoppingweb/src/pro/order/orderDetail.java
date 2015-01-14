package pro.order;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

import pro.pojo.Orders;
import pro.service.OrderService;
import pro.service.impl.OrderServiceImpl;


/**
 * Servlet implementation class orderDetail
 */
public class orderDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
    
    private void toOrderDetail(HttpServletResponse resp, Orders order) throws IOException 
    {
    	resp.setContentType("text/html;charset=UTF-8");
		 PrintWriter out=resp.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
			out.println("<html>");
				out.println("<head>");
					out.println("<title>");
					out.println("达内电子商务门户");
					out.println("</title>");
					out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
					out.println("<meta name='description' content='达内电子商务门户'>");
					out.println("<link href='css/tarena.css' rel=stylesheet>");
				out.println("</head>");
				out.println("<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");

			out.println("<!-- Header Start -->");
					out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
						out.println("<tr>");
							out.println("<td align='left' width='7%' background='images/top_bg.gif'>");out.println("<img src='images/logo.gif' width='286' height='58'>");out.println("</td>");
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
										
			          out.println("<td width='10%'>");out.println("<a href='productList'>");out.println("<img name='Image1' border='0' src='images/index.gif' width='90' height='36'>");out.println("</a>");out.println("</td>");
										
			          out.println("<td width='10%'>");out.println("<a href='userManage'>");out.println("<img name='Image2' border='0' src='images/reg.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
										
			          out.println("<td width='10%'>");out.println("<a href='shoppingCart'>");out.println("<img name='Image4' border='0' src='images/cart.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
										
			          out.println("<td width='10%'>");out.println("<a href='orderList'>");out.println("<img name='Image5' border='0' src='images/order.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");

										
			          out.println("<td width='10%'>");out.println("<a href='productList'>");out.println("<img name='Image6' border='0' src='images/exit.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
									out.println("</tr>");
								out.println("</table>");
							out.println("</td>");
						out.println("</tr>");
					out.println("</table>");
					out.println("<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
						out.println("<tr>");
							out.println("<td width='65%'>");out.println("<br>");

							out.println(">>");
							out.println("欢迎访问");
							out.println("<b>");
							out.println("达内电子商务门户");
							out.println("</b>");
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
								out.println("<a href=index.jsp>");
								out.println("达内电子商务门户");
								out.println("</a>");
								out.println("→");
								out.println("<a href='orderList'>");
								out.println("定单列表");
								out.println("</a>");
								out.println("→");
								out.println("<b>");
								out.println("定单明细");
								out.println("</b>");
							out.println("</td>");
						out.println("</tr>");
					out.println("</table>");
					out.println("<br>");
					
					out.println("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
						out.println("<tr>");
							out.println("<td colspan='2' valign='middle' align='center' height='25' background='images/bg2.gif' width='8%'>");
								out.println("<font color='#ffffff'>");
									out.println("<b>");
									out.println("用户信息");
									out.println("</b>");
								out.println("</font>");
							out.println("</td>");
						out.println("</tr>");
						
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("用户名：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    	        out.println(order.getuserid());
			    			out.println();
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("联系地址：");
								
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getaddress());
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("邮编：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getzip());
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("家庭电话：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.gethomephone());
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("办公室电话：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getofficephone());
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("手机：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getcellphone());
			    			out.println("</td>");
						out.println("</tr>");
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								out.println("<b>");
								out.println("Email地址：");
								out.println("</b>");
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getemail());
			    			out.println("</td>");
						out.println("</tr>");
						
					out.println("</table>");
					out.println("<br>");
					out.println("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
						out.println("<tr>");
							out.println("<td colspan='2' valign='middle' align='center' height='25' background='images/bg2.gif' width='8%'>");
								out.println("<font color='#ffffff'>");
									out.println("<b>");
									out.println("付款方式");
									out.println("</b>");
								out.println("</font>");
							out.println("</td>");
						out.println("</tr>");
						
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle' align='right' width='40%'>");
								
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='60%'>"); 
			    			out.println(order.getpaywaystyle());
			    			out.println("</td>");
						out.println("</tr>");
					
					out.println("</table>");
					out.println("<br>");
					
					
					out.println("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
					out.println("<tr>");
							out.println("<td colspan='5' valign='middle' align='center' height='25' background='images/bg2.gif' width='8%'>");
								out.println("<font color='#ffffff'>");
									out.println("<b>");
									out.println("商品购物清单");
									out.println("</b>");
								out.println("</font>");
							out.println("</td>");
						out.println("</tr>");
						
						out.println("<tr>");
							out.println("<td class=tablebody2 valign='middle'  align='center' width='3%'>");
							out.println("1");	
							out.println("</td>");
							
			    			out.println("<td class=tablebody1 valign='middle' width='50%'>"); 
			    			out.println("&nbsp&nbsp精通");
			    			out.println("</td>");
			    			out.println("<td class=tablebody2 valign='middle' align='center' width='18%'>"); 
			    			out.println("价格：59.0");
			    			out.println("</td>");
			    			out.println("<td class=tablebody1 valign='middle' align='center' width='14%'>"); 
			    			out.println("数量：1");
			    			out.println("</td>");
			    			out.println("<td class=tablebody2 valign='middle' width='25%'>"); 
			    			out.println("小计：￥59.0");
			    			out.println("</td>");
						out.println("</tr>");
						
						out.println("<tr>");
						out.println("<td colspan='4' class=tablebody1 valign='middle' width='75%'>");
						
					    out.println("</td>");
						out.println("<td class=tablebody1 valign='middle' width='25%'>"); 
						out.println("合计：");
						out.println("<font color='red'>");
						out.println("<b>");
						out.println("￥59.0");
						out.println("</b>");
						out.println("<font>");
			    		out.println("</td>");
						out.println("</tr>");
					out.println("</table>");
					out.println("<br>");
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
								out.println("<p align='center'>");
								out.println("Copyright &copy;2004 - 2005");	 
								out.println("<a href='http://www.tarena.com.cn'>");out.println("<b>");out.println("Tarena");out.println("</b>");out.println("<font color='red'>");out.println(".com.cn");out.println("</font>");out.println("</a>");
								out.println("</p>");
							out.println("</td>");

						out.println("</tr>");
					out.println("</table>");
			out.println("<!-- Footer End -->");
				out.println("</body>");
			out.println("</html>");
    	 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    response.setContentType("text/html;charset=UTF-8");		
		
		
		try{
			OrderService orderService = new OrderServiceImpl();
			
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			Orders order = orderService.getorderDetail();
			

			toOrderDetail(response,order);
			
		} catch (Exception e){
			
			toError(response, e.getMessage());
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
