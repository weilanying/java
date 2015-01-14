package pro3.shoppingCart;





import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.pojo.Orders;
import pro3.pojo.ShoppingCart;
import pro3.service.ShoppingCartService;
import pro3.service.impl.ShoppingCartServiceImpl;

public class shoppingCart extends HttpServlet {
	
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws ServletException, IOException {		
		resp.setContentType("text/html;charset=UTF-8");	
		try{
			ShoppingCartService shoppingcartService = new ShoppingCartServiceImpl();
			
			List  shoppingCarts= shoppingcartService.getshoppingCart();
			toshoppingCart(resp, shoppingCarts);
			
		} catch (Exception e){
			toError(resp,e.getMessage());
		}
	}
	private void toshoppingCart(HttpServletResponse resp, List shoppingCarts)
	throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.print("<html>");
		out.print("	<head>");
		out.print("		<title>达内电子商务门户</title>");
		out.print("		<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("		<meta name='description' content='达内电子商务门户'>");
		out.print("		<link href='/css/tarena.css' rel=stylesheet>");
		out.print("	</head>");
		out.print("	<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");
		out.print("<!-- Header Start -->");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
		out.print("			<tr>");
		out.print("				<td align='left' width='7%' background='/images/top_bg.gif'><img src='/images/logo.gif' width='286' height='58'></td>");
		out.print("				<td width='62%' background='/images/top_bg.gif'>　</td>");
		out.print("				<td width='31%' background='/images/top_bg.gif' align='right'><img src='/images/top_r.gif' width='352' height='58' border='0'></td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.print("			<tr>");
		out.print("				<td background='/images/dh_bg.gif' align='left' height='12'>");
		out.print("					<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("						<tr>");
		out.print("							<td width='5%'></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='../product/productList.html'><img name='Image1' border='0' src='/images/index.gif' width='90' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='../user/userManage.html'><img name='Image2' border='0' src='/images/reg.gif' width='92' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='../shoppingCart/shoppingCart.html'><img name='Image4' border='0' src='/images/cart.gif' width='92' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='../order/orderList.html'><img name='Image5' border='0' src='/images/order.gif' width='92' height='36'></a></td>");
		out.print("							");
		out.print("          <td width='10%'><a href='../product/productList.html'><img name='Image6' border='0' src='/images/exit.gif' width='92' height='36'></a></td>");
		out.print("						</tr>");
		out.print("					</table>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
		out.print("			<tr>");
		out.print("				<td width='65%'><br>");
		out.print("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.print("				</td>");
		out.print("				<td width='35%' align='right'>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("<!-- Header End -->");
		out.print("<!-- Body Start -->");
		out.print("		<table cellspacing='1' cellpadding='3' align='center' class='tableBorder2'>");
		out.print("			<tr>");
		out.print("				<td height='25' valign='middle'>");
		out.print("					<img src='/images/Forum_nav.gif' align='absmiddle'>");
		out.print("					<a href=/index.jsp>达内电子商务门户</a> →<img border='0' src='/images/dog.gif' width='19' height='18'><b>购物清单</b>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<br>");
		out.print("		<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
		out.print("			<tr>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='8%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>序号</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='44%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>产品名称</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='8%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>价格</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='8%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>数量</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='8%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>合计</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("				<td valign='middle' align='center' height='25' background='/images/bg2.gif' width='24%'>");
		out.print("					<font color='#ffffff'>");
		out.print("						<b>操作</b>");
		out.print("					</font>");
		out.print("				</td>");
		out.print("			</tr>");
		for(Iterator<ShoppingCart> it = shoppingCarts.iterator();it.hasNext();){
			ShoppingCart   shopp= (ShoppingCart) it.next();
			for(int i=0;i<shoppingCarts.size();i++){
		out.print("			<tr>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					1");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='44%'>");
		out.print("					精通Hibernate：Java对象持久化技术详解");
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					59.0");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='8%'>");
		out.print("					<input type='text' value='1' size='2'>");
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					<b>￥59.0</b>");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='24%'>");
		out.print("					<input type='button' value='取消' size='1'>");
		out.print("					<input type='button' value='保存修改' size='2'>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("			<tr>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					2");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='44%'>");
		out.print("					Effictive Java中文版");
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					39.0");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='8%'>");
		out.print("					<input type='text' value='2' size='2'>");
		out.print("				</td>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					<b>￥78.0</b>");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='24%'>");
		out.print("					<input type='button' value='取消' size='1'>");
		out.print("					<input type='button' value='保存修改' size='2'>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("			<tr>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='8%' colspan='4'>");
		out.print("					");
		out.print("				</td>");
		out.print("				");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%'>");
		out.print("					<font color='red'><b>￥137.0</b></font>");
		out.print("				</td>");
		out.print("				<td class=tablebody1 valign='middle' align='center' width='24%'>");
		out.print("					");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("			<tr>");
		out.print("				<td class=tablebody2 valign='middle' align='center' width='8%' colspan='6'>");
		out.print("				<form>");
		out.print("					<input type='button' value='提交订单' size='1' onclick='javascript:window.location='orderConfirm.html';'>");
		out.print("					<input type='button' value='继续购物' size='2' onclick='javascript:window.location='../product/productList.html';'>");
		out.print("					<input type='button' value='清空购物车' size='2' onclick='javascript:window.location='../product/productList.html';'>");
		out.print("				</form>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<br>");
		out.print("		");
		out.print("		");
		out.print("		");
		out.print("		");
		out.print("<!-- Footer Start -->");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center' height='28'>");
		out.print("			<tr>");
		out.print("				<td height='17' background='/images/bot_bg.gif'>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("		<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("			<tr>");
		out.print("				<td bgcolor='#f1f1f6' height='53' valign='center'>");
		out.print("					<p align='center'>");
		out.print("						Copyright &copy;2004 - 2005 <a href='http://www.tarena.com.cn'><b>Tarena</b><font color='red'>.com.cn</font></a>");
		out.print("					</p>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("<!-- Footer End -->");
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



public void doPost(HttpServletRequest req, 
		HttpServletResponse resp) throws ServletException, IOException {
	
}

}
