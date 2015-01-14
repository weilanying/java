package pro2.product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

import pro2.pojo.Product;
import pro2.service.ProductService;
import pro2.service.impl.ProductServiceImpl;
import pro2.pojo.Product;

/**
 * Servlet implementation class productDetail
 */

public class productDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void toError(HttpServletResponse resp, String message)  throws IOException {
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
	
	private void toProductDetail(HttpServletResponse resp, Product product) throws IOException 
    {
    	resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
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
		out.print("<td align='left' width='7%' background='images/top_bg.gif'><img src='images/logo.gif' width='286' height='58'>");
		out.print("</td>");
		out.print("<td width='62%' background='images/top_bg.gif'>");
		out.print("</td>");
		out.print("	<td width='31%' background='images/top_bg.gif' align='right'><img src='images/top_r.gif' width='352' height='58' border='0'>");
		out.print("</td>");
		out.print("</tr>");
		out.print("	<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		
		out.print("<tr>");
		out.print("<td background='images/dh_bg.gif' align='left' height='12'>");
		out.print("<table width='100' border='0' cellspacing='0' cellpadding='0' align='center'>");
		out.print("<tr>");
		out.print("	<td width='5%'>");
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
		out.print("td");
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
		out.print("td");
		out.print("	</tr>");
		out.print("</table>");
		out.print("</td>");
		out.print("	</tr>");
		out.print("</table>");
		out.print("	<table cellspacing='1' cellpadding='3' align='center' border='0' width='98%'>");
		out.print("<tr>");
		out.print("<td width='65%'>");
		out.print("<br>");
		out.print(">>");
		
		out.print("欢迎访问");
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
		out.println("<a href='productList'>");
		out.print("产品明细");
		out.println("</a>");
		out.println("→");
		out.println("<b>");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<br>");
		out.print("<table cellpadding='3' cellspacing='1' align='center' class='tableborder1'>");
		out.print("<tr>");
		out.print("<td  colspan='2' valign='middle' align='center' height='25' background='images/bg2.gif' width='100%'>");
		out.print("<img src='images/Forum_nav.gif' align='absmiddle'>");
		out.print("<font color='#ffffff'>");
			out.print("<b>");
			out.print("精通Hibernate：Java对象持久化技术详解");
			out.print("</b>");
		out.print("</font>");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	
	out.print("[ 作 &nbsp者 ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getauthor());
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	
	out.print("[ 价 &nbsp格 ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getbasePrice());
	
	out.print("</td>");
    out.print("</tr>");
    out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	
	out.print("[出 版 社]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getpublish());
	out.print("</td>");
    out.print("</tr>");
    out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ 书");
	out.print("&nbsp");
	out.print("号 ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getpages());
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ 页");
	out.print("&nbsp");
	out.print("码]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getproductid());
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[所属类别]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getcategoryid());
		out.print("<br>");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='top' width='25%' align='center'>");
	out.print("[ 简");
	out.print("&nbsp");
	out.print("介]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print(product.getdescription());
	out.print("<br>");

	out.print("<br>");
	
    out.print("</tr>");
    out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%'>");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("&nbsp");
	out.print("<img src='images/zcover2.gif'>");
	out.print("</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td colspan='2' class=tablebody2 valign='top' align='center' width='100%' height='32'>"); 
	out.print("<a href='../shoppingCart/shoppingCart'>");out.print("<img border='0' src='images/buycar.gif' >");out.print("</a>"); 
out.print("</td>");
out.print("</tr>");

out.print("</table>");
out.print("<br>");
out.print("<br>");

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
			out.print("Copyright &copy");
			out.print("2004 - 2005");
			out.print("<a href='http://www.tarena.com.cn'>");out.print("<b>");
			out.print("2004 - 2005");
			out.print("Tarena");
			out.print("</b>");
			out.print("<font color='red'>");
			out.print(".com.cn");
			out.print("</font>");out.print("</a>");
		out.print("</p>");
	out.print("</td>");

out.print("</tr>");
out.print("</table>");
out.print("<!-- Footer End -->");
out.print("</body>");
out.print("</html>");	
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    response.setContentType("text/html;charset=UTF-8");		
		
		
		try{
			ProductService productService = new ProductServiceImpl();
			
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			Product product = productService.getproductDetail();
			

			toProductDetail(response,product);
			
		} catch (Exception e){
			
			toError(response, e.getMessage());
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
}

}