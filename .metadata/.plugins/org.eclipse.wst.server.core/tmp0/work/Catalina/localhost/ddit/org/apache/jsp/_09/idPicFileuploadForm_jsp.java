/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-25 01:48:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class idPicFileuploadForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<!-- \r\n");
      out.write("\tajax 베이스의 form 태그를 활용한 파일 업로드 처리\r\n");
      out.write("\thttp://malsup.com/jquery/form/#download\r\n");
      out.write("\t\tjquery.form.js 다운로드 후 import 활용\r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/form/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var name = '';\r\n");
      out.write("function idPicTargetFile(fileName){\r\n");
      out.write("\t// d:\\\\temp\\\\files\\\\a.png or a.png\r\n");
      out.write("\tvar fileNameArray = fileName.split('\\\\');\r\n");
      out.write("\tfileName = fileNameArray[fileNameArray.length-1];\r\n");
      out.write("\t\r\n");
      out.write("\tif(!/\\.(jpg|jpeg|png|gif)$/.test(fileName.toLowerCase())){\r\n");
      out.write("\t\talert('이미지 파일을 선택해주세요');\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$('#fileName').val(fileName);\r\n");
      out.write("\t$('#idPicForm').ajaxForm({\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\terror : function(result){\r\n");
      out.write("\t\t\t\t\talert(result.status);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\t//{'fileName' : 'a.png'}\r\n");
      out.write("\t\t\t\t\tname = result.fileName;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$('#viewTable').html('<img src=\"/files/'+ name +'\" width=\"200px\" height=\"250px\"/>');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$('#idPicForm').submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("\r\n");
      out.write("#hiddenFileInput{\r\n");
      out.write("\tposition : relative;\r\n");
      out.write("\twidth : 80px; \r\n");
      out.write("\theight:30px; \r\n");
      out.write("\toverflow:hidden; \r\n");
      out.write("\tcursor:pointer; \r\n");
      out.write("\tbackground-image:url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/bt_search.gif');\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write("#idPic{\r\n");
      out.write("\twidth:80px; \r\n");
      out.write("\theight:30px; \r\n");
      out.write("\tfilter:alpha(opacity=0); \r\n");
      out.write("\topacity:0; \r\n");
      out.write("\t-moz-opacity:0; \r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write(".bar {\r\n");
      out.write("    height: 18px;\r\n");
      out.write("    background: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table width=\"354\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"30\" style=\"text-align: center;\"><font color=\"red\" size=\"5\">증명 사진 업로드</font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><img src=\"../image/open_table01.gif\" width=\"354\" height=\"10\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"10\" background=\"../image/open_table02.gif\" align=\"center\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"300\" align=\"center\" valign=\"top\"\r\n");
      out.write("\t\t\t\tbackground=\"../image/open_table02.gif\">\r\n");
      out.write("\t\t\t\t<table width=\"300\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t<div align=\"center\">등록하려는 사진(gif | jpg | jpeg | png)를 선택해주세요.</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"38\" background=\"../image/open_tt.gif\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<form id=\"idPicForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/09/idPicFileUpload.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmethod = \"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"fileName\" name=\"fileName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"hiddenFileInput\">\r\n");
      out.write("\t    \t\t\t\t\t\t\t<input type=\"file\" id=\"idPic\" name=\"idPic\" onchange=\"idPicTargetFile(this.value)\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"overflow: auto; white-space: nowrap; overflow-X: hidden; height: 200px;\" id=\"viewTable\"></div>\r\n");
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
