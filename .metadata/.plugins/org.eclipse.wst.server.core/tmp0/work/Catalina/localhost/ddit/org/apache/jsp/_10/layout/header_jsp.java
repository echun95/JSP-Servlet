/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-16 01:02:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._10.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"android-header mdl-layout__header mdl-layout__header--waterfall\">\r\n");
      out.write("\t\t<div class=\"mdl-layout__header-row\">\r\n");
      out.write("\t\t\t<span class=\"android-title mdl-layout-title\"> \r\n");
      out.write("\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\"><font color=\"yellow\" style=\"font-size: 20px;\">Stiftung DDIT</font></a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t<!-- Add spacer, to align navigation to the right in desktop -->\r\n");
      out.write("\t\t\t<div class=\"android-header-spacer mdl-layout-spacer\"></div>\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"android-search-box mdl-textfield mdl-js-textfield mdl-textfield--expandable mdl-textfield--floating-label mdl-textfield--align-right mdl-textfield--full-width\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-button mdl-js-button mdl-button--icon\"\r\n");
      out.write("\t\t\t\t\tfor=\"search-field\"><i class=\"material-icons\">search</i>\r\n");
      out.write("\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t<div class=\"mdl-textfield__expandable-holder\">\r\n");
      out.write("\t\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"search-field\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Navigation -->\r\n");
      out.write("\t\t\t<div class=\"android-navigation-container\">\r\n");
      out.write("\t\t\t\t<nav class=\"android-navigation mdl-navigation\"> \r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">공지사항</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\"\thref=\"\">자유게시판</a> \r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">자료실</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">QnA</a> \r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">메뉴1</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">메뉴2</a> \r\n");
      out.write("\t\t\t\t\t<a class=\"mdl-navigation__link mdl-typography--text-uppercase\" href=\"\">메뉴3</a>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button\r\n");
      out.write("\t\t\t\tclass=\"android-more-button mdl-button mdl-js-button mdl-button--icon mdl-js-ripple-effect\"\r\n");
      out.write("\t\t\t\tid=\"more-button\">\r\n");
      out.write("\t\t\t\t<i class=\"material-icons\">more_vert</i>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<ul\tclass=\"mdl-menu mdl-js-menu mdl-menu--bottom-right mdl-js-ripple-effect\" for=\"more-button\">\r\n");
      out.write("\t\t\t\t<li class=\"mdl-menu__item\" id=\"info\">개인정보수정</li>\r\n");
      out.write("\t\t\t\t<li class=\"mdl-menu__item\" id=\"myhome\">마이홈</li>\r\n");
      out.write("\t\t\t\t<li disabled class=\"mdl-menu__item\" id=\"message\">쪽지보기</li>\r\n");
      out.write("\t\t\t\t<li disabled class=\"mdl-menu__item\" id=\"schedule\">스케줄관리</li>\r\n");
      out.write("\t\t\t\t<li class=\"mdl-menu__item\" id=\"logout\">로그아웃</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
