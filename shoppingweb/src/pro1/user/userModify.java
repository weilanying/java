package pro1.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userModify
 */
public class userModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userModify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.println("<html>");
			out.println("<head>");
				out.println("<title>");out.println("达内电子商务门户");out.println("</title>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
				out.println("<meta name='description' content='达内电子商务门户'>");
				out.println("<link href='css/tarena.css' rel=stylesheet>");
			out.println("</head>");
			out.println("<body topmargin='0' leftmargin='0' rightmargin='0' bottommargin='0'>");

		out.println("<!-- Header Start -->");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' id='table2'>");
					out.println("<tr>");
						out.println("<td align='left' width='7%' background='images/top_bg.gif'>");out.println("<img src='images/logo.gif' width='286' height='58'>");out.println("</td>");
						out.println("<td width='62%' background='images/top_bg.gif'>");out.println("</td>");
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
		out.println("</html>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		out.println("<form method='post' name='reg'  action='/ecport/user/modify.do'>");
			out.println("<input type='hidden' name='userid' value='admin'/>");

			out.println("<input type='hidden' name='contactid' value='1'/>");
				out.println("<table cellspacing='1' cellpadding='3' align='center' class='tableBorder2'>");

					out.println("<tr>");
						out.println("<td height='25' valign='middle'>");
							out.println("<img src='images/Forum_nav.gif' align='absmiddle'>");
							out.println("<a href=index.jsp>");out.println("达内电子商务门户");out.println("</a>");out.println(" →用户信息修改");
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
				out.println("<br>");
				out.println("<table cellspacing='1' cellpadding='3' align='center' class='tableBorder1'>");
					out.println("<tr>");
						 out.println("<td colspan='2' align='center' valign='middle' background='images/bg2.gif' width='60%'>");out.println("&nbsp;&nbsp;");out.println("<font>");out.println("<b>");out.println("用户信息修改");out.println("</b>");out.println("</font>"); 
		   				 out.println("</td>");
					out.println("<tr>");
					out.println("<tr>");
						out.println("<td width='40%' class='tablebody1'>");out.println("<b>");out.println("用户名");out.println("</b>");out.println("：");out.println("<br>");out.println("英文字母或数字，最大长度为8位");out.println("</td>");
						out.println("<td width='60%' class='tablebody1'>");
						out.println("<input type='text' maxLength='12' size='32'  value='tarena' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
						out.println("<font color='#FF0000'>");out.println("*");out.println("</font>");out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td width='40%' class='tablebody1'>");out.println("<b>");out.println("密码");out.println("</b>");out.println("：");out.println("<br>");out.println("数字，6到8位");out.println("</td>");
						out.println("<td width='60%' class='tablebody1'>");
						out.println("<input type='password' maxLength='12' size='32' name='password' value='tarena' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
						out.println("<font color='#FF0000'>");out.println("*");out.println("</font>");out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td width='40%' class='tablebody1'>");out.println("<b>");out.println("确认密码");out.println("</b>");out.println("：");out.println("<br>");out.println("数字，6到8位");out.println("</td>");
						out.println("<td width='60%' class='tablebody1'>");
						out.println("<input type='password' maxLength='12' size='32' name='password2' value='tarena' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
						out.println("<font color='#FF0000'>");out.println("*");out.println("</font>");out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td width='40%' class='tablebody1'>");out.println("<b>");out.println("所在地区");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td width='60%' class='tablebody1'>");
							out.println("<select name='country' onchange='javascript:initProvince(this.value)' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'>");
		    						out.println("<option value='1'  selected>");out.println("中国");out.println("</option>");
		    						out.println("<option value='2' >");out.println("中国香港");out.println("</option>");
		    						out.println("<option value='3' >");out.println("中国台湾");out.println("</option>");
							out.println("</select>");
							out.println("<select name='province' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'>");
		               		  	
			    					out.println("<option value='1' >");out.println("安徽");out.println("</option>");
			    					out.println("<option value='2' >");out.println("北京");out.println("</option>");
			    					out.println("<option value='3' >");out.println("重庆");out.println("</option>");
			    					out.println("<option value='4' >");out.println("福建");out.println("</option>");
			    					out.println("<option value='5' >");out.println("广东");out.println("</option>");
			    					out.println("<option value='6' >");out.println("甘肃");out.println("</option>");
			    					out.println("<option value='7' >");out.println("广西");out.println("</option>");
			    					out.println("<option value='8' >");out.println("贵州");out.println("</option>");
			    					out.println("<option value='9' >");out.println("河南");out.println("</option>");
			    					out.println("<option value='10' >");out.println("湖北");out.println("</option>");
			    					out.println("<option value='11' >");out.println("河北");out.println("</option>");
			    					out.println("<option value='12' >");out.println("海南");out.println("</option>");
			    					out.println("<option value='13' >");out.println("香港");out.println("</option>");
			    					out.println("<option value='14' >");out.println("黑龙江");out.println("</option>");
			    					out.println("<option value='15' >");out.println("湖南");out.println("</option>");
			    					out.println("<option value='16' >");out.println("吉林");out.println("</option>");
			    					out.println("<option value='17' >");out.println("江苏");out.println("</option>");
			    					out.println("<option value='18' >");out.println("江西");out.println("</option>");
			    					out.println("<option value='19' >");out.println("辽宁");out.println("</option>");
			    					out.println("<option value='20' >");out.println("澳门");out.println("</option>");
			    					out.println("<option value='21' >");out.println("内蒙古");out.println("</option>");
			    					out.println("<option value='22' >");out.println("宁夏");out.println("</option>");
			    					out.println("<option value='23' >");out.println("青海");out.println("</option>");
			    					out.println("<option value='24' >");out.println("四川");out.println("</option>");
			    					out.println("<option value='25' >");out.println("山东");out.println("</option>");
			    					out.println("<option value='26'  selected>");out.println("上海");out.println("</option>");
			    					out.println("<option value='27' >");out.println("陕西");out.println("</option>");
			    					out.println("<option value='28' >");out.println("山西");out.println("</option>");
			    					out.println("<option value='29' >");out.println("天津");out.println("</option>");
			    					out.println("<option value='30' >");out.println("台湾");out.println("</option>");
			    					out.println("<option value='31' >");out.println("新疆");out.println("</option>");
			    					out.println("<option value='32' >");out.println("西藏");out.println("</option>");
			    					out.println("<option value='33' >");out.println("云南");out.println("</option>");
			    					out.println("<option value='34' >");out.println("浙江");out.println("</option>");
			    					out.println("<option value='35' >");out.println("其它");out.println("</option>");
			    					out.println("<option value='36' >");out.println("中国香港");out.println("</option>");
			    					out.println("<option value='37' >");out.println("中国台湾");out.println("</option>");
						out.println("</select>");out.println("省");
						out.println("<input type='text' size='8' name='city' value='黄埔' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");out.println("市/县");out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("联系地址1");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='64' maxlength='32' name='street1' value='北京东路668号B区901' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("联系地址2");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='64' maxlength='32' name='street2' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("邮编");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='32' maxlength='8' name='zip' value='200001' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("家庭电话");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='32' maxlength='16' name='homephone' value='61202663' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("办公室电话");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='32' maxlength='16' name='officephone' value='61202663' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");
						out.println("<td class='tablebody1'>");out.println("<b>");out.println("手机");out.println("</b>");out.println("：");out.println("</td>");
						out.println("<td class='tablebody1'>");
						out.println("<input type='text' size='32' maxlength='16' name='officephone' value='13211161676' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");
					out.println("</td>");
					out.println("<tr>");

					out.println("<td class='tablebody1'>");out.println("<b>");out.println("Email地址");out.println("</b>");out.println("：");out.println("<br>");out.println("	请输入有效的邮件地址");out.println("</td>");
					out.println("<td class='tablebody1'>");
					out.println("<input maxLength='50' size='32' maxlength='32' name='email' value='wawawa115@sina.com' style='font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000'/>");out.println("</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td class='tablebody2' valign='middle' colspan='2' align='center'>");
					out.println("<input type='button' value='修&nbsp;改' onclick='javascript:checkReg()'/>");
					out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
		out.println("</form>");
		out.println("<html>");
			out.println("<body>");
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center' height='28'>");
				  out.println("<tr>");

				    out.println("<td height='17' background='/ecport/images/bot_bg.gif'>");out.println("</td>");
				  out.println("</tr>");
				out.println("</table>");
				
				out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'>");
				  out.println("<tr>");
				    out.println("<td bgcolor='#f1f1f6' height='53' valign='center'>");
					out.println("<p align='center'>");
					out.println("Copyright &copy;2004 - 2005 ");out.println("<a href='http://www.tarena.com.cn'>");

						out.println("<b>");out.println("<font face='Verdana,'>");out.println("Tarena");out.println("</font>");out.println("</b>");
						out.println("<font color=#CC0000>");out.println(".com.cn");out.println("</font>");
					out.println("</a>");out.println("</p>");out.println("<br>");
				    out.println("</td>");
				  out.println("</tr>");
				out.println("</table>");
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
