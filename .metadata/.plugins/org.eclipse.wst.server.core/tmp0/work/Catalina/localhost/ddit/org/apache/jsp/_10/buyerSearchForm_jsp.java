/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-16 01:29:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buyerSearchForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {f on t-family:\"돋움\";\r\n");
      out.write("\tfont-size: 9pt;\r\n");
      out.write("\tline-height: 16px;\r\n");
      out.write("\tcolor: #818181;\r\n");
      out.write("\tletter-spacing: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a {\r\n");
      out.write("\tfont-family: \"돋움\";\r\n");
      out.write("\tfont-size: 9pt;\r\n");
      out.write("\tline-height: 16px;\r\n");
      out.write("\tcolor: #818181;\r\n");
      out.write("\tletter-spacing: 0px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a:hover {\r\n");
      out.write("\tfont-family: \"돋움\";\r\n");
      out.write("\tfont-size: 9pt;\r\n");
      out.write("\tline-height: 16px;\r\n");
      out.write("\tcolor: #818181;\r\n");
      out.write("\tletter-spacing: 0px;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/js/common/validation.js'></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('input[type=image]').click(function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t//type : POST  디폴트가 POST\r\n");
      out.write("\t\t\t//async : true 디폴트가 true\r\n");
      out.write("\t\t\t//timeout : 디폴트 무제한\r\n");
      out.write("\t\t\turl : '");
      out.print(request.getContextPath());
      out.write("/10/buyerSearchResult.jsp',\r\n");
      out.write("\t\t\tdata : {buyer_id : $('#buyer_id').val()},\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\terror : function(result){\r\n");
      out.write("\t\t\t\t\t\talert('error code : ' + result.status + \r\n");
      out.write("\t\t\t\t\t\t\t\t' | message : ' + result.responseText);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\t\tvar htmls = '<table width=\"100%\" height=\"200px\" cellspacing =\"0\" cellpadding=\"0\" ' +\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'style=\"overflow:scroll;\" id=\"buyerTBL\">' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t'<thead>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'<tr>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'<th>거래처 코드</th>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'<th>거래처 이름</th>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'<th>거래처 은행</th>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'<th>거래처 번호</th>' +\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'</tr>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t'</thead>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t'<tbody>';\r\n");
      out.write("\t\t\t\t\t\tfor(var i = 0; i < result.length; i++){\r\n");
      out.write("\t\t\t\t\t\t\thtmls += '<tr>' + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  '<td>' + result[i].buyer_id + '</td>'+ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  '<td>' + result[i].buyer_name + '</td>'+ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  '<td>' + result[i].buyer_bank + '</td>'+ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  '<td>' + result[i].buyer_comtel + '</td>'+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'</tr>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtmls += '</tbody></table>';\r\n");
      out.write("\t\t\t\t\t\t$('#viewTable').empty().html(htmls);\r\n");
      out.write("\t\t\t\t\t\t$('#buyerTBL tr:gt(0)').click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar buyer_id = $(this).find('td:eq(0)').text();\r\n");
      out.write("\t\t\t\t\t\t\t$(opener.document).find('#prod_buyer').val(buyer_id);\r\n");
      out.write("\t\t\t\t\t\t\t$(opener.document).find(\"#div1\").addClass(\"is-dirty\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tself.close();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table width=\"354\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><img src=\"../image/open_table01.gif\" width=\"354\" height=\"10\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<table width=\"300\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\"><div align=\"center\">찾고자 하는 거래처 검색\r\n");
      out.write("\t\t\t\t\t\t\t\t입력해주십시오.</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"38\" background=\"../image/open_tt.gif\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"buyer_id\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"image\"  src=\"../image/bt_search.gif\" border='0'\r\n");
      out.write("\t\t\t\t\t\t\talign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"overflow: auto; white-space: nowrap; overflow-X: hidden; height: 200px;\" id=\"viewTable\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><img src=\"../image/open_table03.gif\" width=\"354\" height=\"10\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
