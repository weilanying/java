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
		out.print("���ڵ��������Ż�");
		out.print("</title>");
		out.print("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("<meta name='description' content='���ڵ��������Ż�'>");
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
		out.print("��ӭ����");
		out.print("<b>");
		out.print("���ڵ��������Ż�");
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
		out.print("���ڵ��������Ż�");
		out.print("</a>");
		out.print("��");
		out.print("��Ʒ��ϸ");
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
			out.print("��ͨHibernate��Java����־û��������");
			out.print("</b>");
		out.print("</font>");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ �� &nbsp�� ]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("������");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ �� &nbsp�� ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("59.00");
	
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[�� �� ��]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("���ӹ�ҵ������");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ ��");
	out.print("&nbsp");
	out.print("�� ]");
	
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("2");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[ ҳ");
	out.print("&nbsp");
	out.print("��]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("600");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='middle' width='25%' align='center'>");
	out.print("[�������]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("�����ٵļ�����鼮 �����ĵ�:");
		out.print("<br>");
	out.print("</td>");
out.print("</tr>");
out.print("<tr>");
	out.print("<td class=tablebody1 valign='top' width='25%' align='center'>");
	out.print("[ ��");
	out.print("&nbsp");
	out.print("��]");
	out.print("</td>");
	
	out.print("<td class=tablebody1 valign='middle' width='75%'>");
	out.print("���˵��Ľṹ�ñȷ��ݵĿ�ܣ����������ñȷ��ݵľ������Ԫ�ء������������ݵ���ʽ��Ϊ�����֡� ���ͼ�ͷ�����Ϊ�˰�ĳ��֪ʶ�������������Ҫ�ۺ�ʹ����������ʽ��Ԫ��......");
	out.print("<br>");
	out.print("�̡�Tomcat �� Java Web�����������(������)���͡���ͨStruts������MVC��Java Web����뿪��(������)��֮��Ӧ�����ߵ�ǿ��Ҫ�������ٵ���һ��������ͨHibernate��Java����־û�������⡷��������ӭ�����е�׼�����С�\\nHibernate��һ������Java�Ŀ���Դ����ĳ־û��м��������JDBC������������װ�������ṩORMӳ����񣬻��ṩ���ݲ�ѯ�����ݻ��湦�ܣ�Java������Ա���Է����ͨ��Hibernate API���������ݿ⡣\r\n���ڣ�Խ��Խ���Java������Ա��Hibernate��Ϊ��ҵӦ�ú͹�ϵ���ݿ�֮����м�����Խ�ʡ�Ͷ���־û��йص�30%��JDBC��̹������� 2005�꣬Hibernate��Ϊ���������������ٻ��˵�15��Jolt�󽱡�Hibernate֮�����ܹ����У��鹦�������е����ơ�");
	out.print("<br>");
	out.print("\r\n���������ϴ������͵�ʵ������ϸ����������Ŀǰ������Hibernate2.1�汾����Java����־û��ļ�����Hibernate������Java ����ģ�ͺ͹�ϵ����ģ�͵�������ͨ�����飬���߲�����������Hibernate���߶�������ģ�ͽ���ӳ��ļ��������ܻ������뿪��Java����ģ�ͺ͹�ϵ����ģ�͵��Ƚ����顣"); 
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