package pro.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.pojo.Orders;
import pro.service.OrderService;
import pro.service.impl.OrderServiceImpl;

import java.util.Iterator;
import java.util.List;





public class orderList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html;charset=UTF-8");		
		
		
		try{
			OrderService orderService = new OrderServiceImpl();
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			List orderList = orderService.getorderList();
			

			toOrderList(resp, orderList);
			
		} catch (Exception e){
			
			toError(resp, e.getMessage());
		}
		
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
	private void toOrderList(HttpServletResponse resp, List orderList)throws IOException {
		
	PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.println("<html>");
		out.println("<head>");
			out.println("<title>");
				out.println("达内电子商务门户");
		    out.println("</title>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
				out.println("<meta name='description' content='达内电子商务门户'>");
				out.println("<link href='css/tarena.css' rel=stylesheet>");
	   out.println("</head>");
	   
	   out.println("<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");
	   out.println("<!-- Header Start -->");
	   
	   out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
					out.println("<tr>");
						out.println("<td align='left' width='7%' background='images/top_bg.gif'>");
						out.println("<img src='images/logo.gif' width='286' height='58'>");
						out.println("</td>");
						out.println("<td width='62%' background='/images/top_bg.gif'>");
						out.println("</td>");
						out.println("<td width='31%' background='/images/top_bg.gif' align='right'>");
						out.println("<img src='images/top_r.gif' width='352' height='58' border='0'>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
				out.println("<tr>");
				out.println("<td background='images/dh_bg.gif' align='left' height='12'>");
				out.println("<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
								out.println("<tr>");
									out.println("<td width='5%'>");out.println("</td>");
									
		          out.println("<td width='10%'>");
		          out.println("<a href='productList'>");
		          out.println("<img name='Image1' border='0' src='images/index.gif' width='90' height='36'>");
		          out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");
		          out.println("<a href='userManage'>");
		          out.println("<img name='Image2' border='0' src='images/reg.gif' width='92' height='36'>");
		          out.println("</a>");out.println("</td>");
									
		          out.println("<td width='10%'>");
		          out.println("<a href='shoppingCart'>");
		          out.println("<img name='Image4' border='0' src='images/cart.gif' width='92' height='36'>");
		          out.println("</a>");
		          out.println("</td>");
									
		          out.println("<td width='10%'>");
		          out.println("<a href='orderList'>");
		          out.println("<img name='Image5' border='0' src='images/order.gif' width='92' height='36'>");
		          out.println("</a>");
		          out.println("</td>");
									
		          out.println("<td width='10%'>");
		          out.println("<a href='productList'>");out.println("<img name='Image6' border='0' src='images/exit.gif' width='92' height='36'>");out.println("</a>");out.println("</td>");
								out.println("</tr>");
							out.println("</table>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
					out.println("<tr>");
						out.println("<td width='65%'>");out.println("<br>");
                        out.println(">>");out.println("欢迎访问"); 
                        out.println("<b>");out.println("达内电子商务门户");out.println("</b>");
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
							out.println("<img border='0' src='images/dog.gif' width='19' height='18'>");out.println("定单列表");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<br>");
				out.println("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
					out.println("<tr>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("序号");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("订单编号");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("订单金额");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("订单状态");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("付款方式");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
						out.println("<td valign=middle align=center height=25 background='images/bg2.gif'>");
						out.println("<font color='#ffffff'>");
						out.println("<b>");
						out.println("操作");
						out.println("</b>");
						out.println("</font>");
						out.println("</td>");
					out.println("</tr>");
					
					for(Iterator<Orders> it = orderList.iterator();it.hasNext();){
						Orders   order= (Orders) it.next();
						for(int i=0;i<orderList.size();i++){
						out.println("			<tr>");
						out.println("				<td class=tablebody2 valign=middle align=left>" + i + "</td>");
						out.println("<a href='orderDetail'>");
						
		
						out.println("				<td class=tablebody2 valign=middle align=left>" + order.getname() + "</td>");
						out.println("				<td class=tablebody2 valign=middle align=left>" + order.getcost() + "</td>");
						out.println("				<td class=tablebody1 valign=middle align=center>" + order.getorderstatusname() + "</td>");
						out.println("				<td  class=tablebody2 valign=middle align=left>" + order.getpaywaystyle()+ "</td>");
						out.println("<td class=tablebody1 valign=middle align=center>");
						out.println("<input type='button' value='删除' onclick='javascript:window.location='orderList';'>");
						out.println("&nbsp");
						out.println("<input type='button' value='明细' onclick='javascript:window.location='orderDetail';'>");
					out.println("</td>");
						
						out.println("			</tr>");
						}
					}		
				
					
					
					/*out.println("<tr>");
						out.println("<td class=tablebody2 valign=middle align=center>");
						out.println("1");
						out.println("</td>");
						out.println("<td class=tablebody1 valign=middle>");
						out.println("&nbsp");out.println("&nbsp");
						out.println("<a href='orderDetail'>");
						out.println("389");out.println("</a>");
						out.println("</td>");
						out.println("<td class=tablebody2 valign=middle align=left>");
						out.println("&nbsp");
						out.println("&nbsp");
						out.println("￥59.0");
						out.println("</td>");
						out.println("<td class=tablebody1 valign=middle align=center>");
						out.println("pending");
						out.println("</td>");
						out.println("<td class=tablebody2 valign=middle align=left>");
						out.println("货到付款");
						out.println("</td>");
						out.println("<td class=tablebody1 valign=middle align=center>");
							out.println("<input type='button' value='删除' onclick='javascript:window.location='orderList';'>");
							out.println("&nbsp");
							out.println("<input type='button' value='明细' onclick='javascript:window.location='orderDetail';'>");
						out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td class=tablebody2 valign=middle align=center>");out.println("2");out.println("</td>");
						out.println("<td class=tablebody1 valign=middle>");out.println("&nbsp");out.println("&nbsp");out.println("<a href='orderDetail'>");out.println("389");out.println("</a>");out.println("</td>");
						out.println("<td class=tablebody2 valign=middle align=left>");out.println("&nbsp");out.println("&nbsp");out.println("￥137.0");out.println("</td>");
						out.println("<td class=tablebody1 valign=middle align=center>");out.println("pending");out.println("</td>");
						out.println("<td class=tablebody2 valign=middle align=left>");out.println("&nbsp");out.println("&nbsp");out.println("邮局汇款");out.println("</td>");
						out.println("<td class=tablebody1 valign=middle align=center>");
							out.println("<input type='button' value='删除' onclick='javascript:window.location='orderList';'>");out.println("&nbsp");
							out.println("<input type='button' value='明细' onclick='javascript:window.location='orderDetail';'>");
						out.println("</td>");
					out.println("</tr>");*/			
					out.println("</table>");
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
							out.println("<a href='http://www.tarena.com.cn'>");
							out.println("<b>");out.println("Tarena");out.println("</b>");out.println("<font color='red'>");out.println(".com.cn");out.println("</font>");out.println("</a>");
							out.println("</p>");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
		out.println("<!-- Footer End -->");
			out.println("</body>");
		out.println("</html>");

	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
