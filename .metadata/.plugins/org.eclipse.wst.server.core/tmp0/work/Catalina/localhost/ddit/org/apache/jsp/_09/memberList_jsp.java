/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-12 00:21:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.or.ddit.vo.MemberVO;
import java.util.List;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.service.IMemberService;

public final class memberList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	IMemberService service = MemberServiceImpl.getInstance();
	List<MemberVO> memberList = service.memberList();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/ddit/06/common/validation.js'></script> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('table tr:gt(0)').click(function(){\r\n");
      out.write("\t\t\tvar mem_id = $(this).find('td:eq(0)').text();\r\n");
      out.write("\t\t\tlocation.replace('");
      out.print(request.getContextPath());
      out.write("/09/main.jsp?contentPage=/09/memberView.jsp?mem_id=' + mem_id);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"list\">\r\n");
      out.write("\t<table class=\"mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp\" style=\"width: 100%;\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"mdl-data-table__cell--non-numeric\">아이디</th>\r\n");
      out.write("\t\t\t\t<th class=\"mdl-data-table__cell--non-numeric\">패스워드</th>\r\n");
      out.write("\t\t\t\t<th class=\"mdl-data-table__cell--non-numeric\">이름</th>\r\n");
      out.write("\t\t\t\t<th class=\"mdl-data-table__cell--non-numeric\">주민번호1</th>\r\n");
      out.write("\t\t\t\t<th class=\"mdl-data-table__cell--non-numeric\">주민번호2</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t");

			for(int i=0; i<memberList.size(); i++){
		
      out.write("\r\n");
      out.write("\t\t\t<tr>                                                      \r\n");
      out.write("\t\t\t\t<td>");
      out.print(memberList.get(i).getMem_id() );
      out.write("</td>                  \r\n");
      out.write("\t\t\t\t<td>");
      out.print(memberList.get(i).getMem_name() );
      out.write("</td>                  \r\n");
      out.write("\t\t\t\t<td>");
      out.print(memberList.get(i).getMem_regno1() );
      out.write("</td>                  \r\n");
      out.write("\t\t\t\t<td>");
      out.print(memberList.get(i).getMem_job() );
      out.write("</td>                  \r\n");
      out.write("\t\t\t\t<td>");
      out.print(memberList.get(i).getMem_like() );
      out.write("</td>                  \r\n");
      out.write("\t\t\t</tr>                                                     \r\n");
      out.write("\t\t");
		
			}
		
      out.write("       \r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"searchForm\" align=\"right\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t<form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/18_1/main.jsp?contentPage=boardList.jsp\">\r\n");
      out.write("\t\t<select name=\"search_keycode\">\r\n");
      out.write("\t\t\t<option value=\"ALL\">전체</option>\r\n");
      out.write("\t\t\t<option value=\"TITLE\">제목</option>\r\n");
      out.write("\t\t\t<option value=\"CONTENT\">컨텐츠</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<input type=\"text\" id=\"search_keyword\" name=\"search_keyword\">\r\n");
      out.write("\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--accent\" type=\"submit\">검색</button>\r\n");
      out.write("\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--accent\" type=\"button\">글쓰기</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
