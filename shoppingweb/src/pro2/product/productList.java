package  pro2.product;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import pro2.pojo.Product;
import pro2.service.ProductService;
import pro2.service.impl.ProductServiceImpl;

import java.util.Iterator;
import java.util.List;



public class productList extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {	
		resp.setContentType("text/html;charset=UTF-8");
		try{
			ProductService productService = new ProductServiceImpl();
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			List productList = productService.getProductList();

			toProductList(resp, productList);
			
		} catch (Exception e){
			toError(resp,e.getMessage());
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
		
	private void toProductList(HttpServletResponse resp, List productList)
	throws IOException {
		
PrintWriter out = resp.getWriter();	
		out.print("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>");
		out.print("达内电子商务门户");
		out.print("</title>");
		out.print("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("<meta name='description' content='达内电子商务门户'>");
		out.print("<link href='css/tarena.css' rel=stylesheet>");
		out.print("</head>");
		out.print("<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");
		
			
		out.print("<!-- Header Start -->");
		out.print("<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
		out.print("<tr>");
		out.print("<td align='left' width='7%' background='images/top_bg.gif'>");
		out.print("<img src='images/logo.gif' width='286' height='58'>");
		out.print("</td>");
		out.print("<td width='62%' background='images/top_bg.gif'>");
		out.print("</td>");
		out.print("<td width='31%' background='images/top_bg.gif' align='right'>");
		out.print("<img src='images/top_r.gif' width='352' height='58' border='0'>");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		
		
		out.print("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.print("<tr>");
		out.print("<td background='images/dh_bg.gif' align='left' height='12'>");
		out.print("<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("<tr>");
		out.print("<td width='5%'>");
		out.print("</td>");
									
		out.print("<td width='10%'>");
		out.print("<a href='productList'>");
		out.print("<img name='Image1' border='0' src='images/index.gif' width='90' height='36'>");
		out.print("</a>");
		out.print("</td>");
									
		out.print("<td width='10%'>");
		out.print("<a href='userManage'>");
		out.print("<img name='Image2' border='0' src='images/reg.gif' width='92' height='36'>");
		out.print("</a>");
		out.print("</td>");						
		out.print("<td width='10%'>");
		out.print("<a href='shoppingCart'>");
		out.print("<img name='Image4' border='0' src='images/cart.gif' width='92' height='36'>");
		out.print("</a>");
		out.print("</td>");

		out.print("<td width='10%'>");
		out.print("<a href='orderList'>");
		out.print("<img name='Image5' border='0' src='images/order.gif' width='92' height='36'>");
		out.print("</a>");
		out.print("</td>");
									
		out.print("<td width='10%'>");
		out.print("<a href='productList'>");
		out.print("<img name='Image6' border='0' src='images/exit.gif' width='92' height='36'>");
		out.print("</a>");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
		out.print("<tr>");
		out.print("<td width='65%'>");
		out.print("<br>");
	
							out.print(">>欢迎访问");
							out.print("<b>");
							out.print("达内电子商务门户");
							out.print("</b>");
						out.print("</td>");
						out.print("<td width='35%' align='right'>");
						out.print("</td>");
					out.print("</tr>");
				out.print("</table>");
		out.print("<!-- Header End -->");
		
	
		
		
		out.print("<!-- Body Start -->");
				out.print("<table cellspacing='1' cellpadding='3' align='center' class='tableBorder2'>");
					out.print("<tr>");
						out.print("<td height='25' valign='middle'>");
							out.print("<img src='images/Forum_nav.gif' align='absmiddle'>");
							out.print("<a href=index.jsp>");
							out.print("达内电子商务门户");
							out.print("</a>");
							out.print("→");
							out.print("<img border='0' src='images/dog.gif' width='19' height='18'>");
							out.print("欢迎");
							out.print("<font color='red'>");
							out.print("admin");
							out.print("</font>");
							out.print("光临！");
						out.print("</td>");
					out.print("</tr>");
				out.print("</table>");
				out.print("<br>");
				
				out.print("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
					out.print("<tr>");
						out.print("<td valign='middle' align='center' height='25' background='images/bg2.gif' width='8%'>");
							out.print("<font color='#ffffff'>");
								out.print("<b>");
								out.print("序号");
								out.print("</b>");
							out.print("</font>");
						out.print("</td>");
						
						out.print("<td valign='middle' align='center' height='25' background='images/bg2.gif' width='60%'>");
							out.print("<font color='#ffffff'>");
								out.print("<b>");
								out.print("产品名称");
								out.print("</b>");
							out.print("</font>");
						out.print("</td>");
						
						
						out.print("<td valign='middle' align='center' height='25' background='images/bg2.gif' width='8%'>");
							out.print("<font color='#ffffff'>");
								out.print("<b>");
								out.print("价格");out.print("</b>");
							out.print("</font>");
						out.print("</td>");
						
						out.print("<td valign='middle' align='center' height='25' background='images/bg2.gif' width='24%'>");
							out.print("<font color='#ffffff'>");
								out.print("<b>");
								out.print("操作");out.print("</b>");
							out.print("</font>");
						out.print("</td>");
					out.print("</tr>");
					for(Iterator<Product> it = productList.iterator();it.hasNext();){
						Product product = (Product) it.next();
						
						out.println("			<tr>");
						out.println("				<td>" + product.getproductid() + "</td>");
						out.println("				<td>" + product.getname() + "</td>");
						out.println("				<td>" + product.getbasePrice() + "</td>");
						out.println("				<td>" + product.getcategoryid() + "</td>");
						
						
						   out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>");
						     out.print("<a href='../shoppingCart/shoppingCart'>");
						     out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
						     out.print("</a>"); 
						    out.print("</td>");
						    out.println("			</tr>");
					}		
					
			/*out.print("<tr>");
			out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
			out.print("Product.gey");	
			out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>"); 
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>");
		    out.print("精通Hibernate：Java对象持久化技术详解");
		    out.print("</a>"); 
		    out.print("</td>");
						
		    out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
			out.print("59.0");	
			out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>"); 
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
			out.print("</tr>");  
		
		
			
			out.print("<tr>");
			out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
			out.print("2");
			out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>");
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>");
		    out.print("Effective Java中文版");
		    out.print("</a>"); out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("39.0");
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>"); 
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
					out.print("</tr>");
					out.print("<tr>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("3");
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>"); 
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>");
		    out.print("精通Spring");
		    out.print("</a>"); 
		    out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("39.0");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>");
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
					out.print("</tr>");
					out.print("<tr>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("4");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>"); 
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>");
		    out.print("深入浅出Hibernate");
		    out.print("</a>"); 
		    out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("59.0");
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>"); 
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
					out.print("</tr>");
					out.print("<tr>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("5");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>");
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>");
		    out.print("JAVA编程思想：第3版");
		    out.print("</a>"); 
		    out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("95.0");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>");
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
					out.print("</tr>");
					out.print("<tr>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("6");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>"); 
		    out.print("&nbsp");
		    out.print("&nbsp");
		    out.print("<a href='productDetail'>"); 
		    out.print("Java2核心技术（第6版） 卷I：基础知识 ");out.print("</a>"); out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("75.0");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>");
		     out.print("<a href='../shoppingCart/shoppingCart'>");
		     out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		     out.print("</a>"); 
		    out.print("</td>");
					out.print("</tr>");
					out.print("<tr>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("7");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>");
		    out.print("&nbsp");
		    out.print("&nbsp");out.print("<a href='productDetail'>");
		    out.print("Tomcat与Java Web开发技术详解");
		    out.print("</a>"); out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("45.0");	
						out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' align='center' width='24%'>"); 
		    out.print("<a href='../shoppingCart/shoppingCart'>");
		    out.print("<img border='0' src='images/car_new.gif' width='97' height='18'>");
		    out.print("</a>"); 
		    out.print("</td>");
			out.print("</tr>"); 
			out.print("<tr>");
			out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
			out.print("8");	
			out.print("</td>");
						
		    out.print("<td class=tablebody1 valign='middle' width='60%'>"); 
		    out.print("&nbsp");
		    out.print("&nbsp");out.print("<a href='productDetail'>");
		    
		    out.print("Java与模式");out.print("</a>"); 
		    out.print("</td>");
						out.print("<td class=tablebody2 valign='middle' align='center' width='8%'>");
						out.print("88.0");	
						out.print("</td>");
						
		 
					out.print("</tr>");*/
			
				out.print("</table>");
		out.print("<!-- Body End -->");
		
		out.print("<!-- Footer Start -->");
				out.print("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center' height='28'>");
					out.print("<tr>");
						out.print("<td height='17' background='images/bot_bg.gif'>");
						out.print("</td>");
					out.print("</tr>");
				out.print("</table>");
				out.print("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'>");
					out.print("<tr>");
						out.print("<td bgcolor='#f1f1f6' height='53' valign='center'>");
							out.print("<p align='center'>");
							out.print("Copyright &copy;2004 - 2005");	
							out.print("<a href='http://www.tarena.com.cn'>");
							out.print("<b>");out.print("Tarena");
							out.print("</b>");out.print("<font color='red'>");
							out.print(".com.cn");out.print("</font>");out.print("</a>");
							out.print("</p>");
						out.print("</td>");
					out.print("</tr>");
				out.print("</table>");
		out.print("<!-- Footer End -->");
			out.print("</body>");
		out.print("</html>");
		out.close();	
		
		
		
			}


		public void doPost(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {


		}
}
