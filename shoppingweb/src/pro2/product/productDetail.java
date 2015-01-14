package pro2.product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class productDetail extends HttpServlet {
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws ServletException, IOException {		
		resp.setContentType("text/html;charset=UTF-8");	
		PrintWriter out = resp.getWriter();
		
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
		out.print("产品明细");
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
	out.print("孙卫琴");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ 价 &nbsp格 ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("59.00");
	
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[出 版 社]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("电子工业出版社");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ 书");
	out.print("&nbsp");
	out.print("号 ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("2");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ 页");
	out.print("&nbsp");
	out.print("码]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("600");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[所属类别]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("孙卫琴的计算机书籍 创作心得:");
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
	out.print("如果说书的结构好比房屋的框架，书的内容则好比房屋的具体组成元素。计算机书的内容的形式分为：文字、 表格、图和范例。为了把某种知识讲清楚，常常需要综合使用这四种形式的元素......");
	out.print("<br>");
	out.print("继《Tomcat 与 Java Web开发技术详解(含光盘)》和《精通Struts：基于MVC的Java Web设计与开发(含光盘)》之后，应广大读者的强烈要求，孙卫琴的又一力作《精通Hibernate：Java对象持久化技术详解》，正处在迎接面市的准备当中。\\nHibernate是一个基于Java的开放源代码的持久化中间件，它对JDBC作了轻量级封装，不仅提供ORM映射服务，还提供数据查询和数据缓存功能，Java开发人员可以方便的通过Hibernate API来操纵数据库。\r\n现在，越来越多的Java开发人员把Hibernate作为企业应用和关系数据库之间的中间件，以节省和对象持久化有关的30%的JDBC编程工作量。 2005年，Hibernate作为优秀的类库和组件，荣获了第15届Jolt大奖。Hibernate之所以能够流行，归功于它特有的优势。");
	out.print("<br>");
	out.print("\r\n　　本书结合大量典型的实例，详细介绍了运用目前最成熟的Hibernate2.1版本进行Java对象持久化的技术。Hibernate是连接Java 对象模型和关系数据模型的桥梁，通过本书，读者不仅能掌握用Hibernate工具对这两种模型进行映射的技术，还能获得设计与开发Java对象模型和关系数据模型的先进经验。"); 
	out.print("</td>");
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
		
out.close();		
		
		
	}


public void doPost(HttpServletRequest req, 
		HttpServletResponse resp) throws ServletException, IOException {


}


}