/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-11 06:47:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.text.AbstractDocument.Content;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//http://localhost/ddit/09/main.jsp (default : 전체 회원 리스트 출력)
	//http://localhost/ddit/09/main.jsp?contentPage=/09/memberForm.jsp
	//http://localhost/ddit/09/main.jsp?contentPage=/09/memberView.jsp
	//http://localhost/ddit/09/main.jsp?contentPage=/09/memberList.jsp
	String contentPage = request.getParameter("contentPage");
	if(contentPage == null){
		contentPage = "/09/memberList.jsp";
	}
	
	//1. loginForm.jsp 활용
	//2. 로그인 후  main.jsp 요청 시작
	//3. memberList.jsp 
	//	[검색] | [글쓰기] 미구현
	//4. loginForm.jsp에서 '회원가입을 원하세요?' 클릭시 main.jsp 내 컨텐츠 영역에  memberForm.jsp 컨텐츠 출력
	//5. memberForm.jsp 컨텐츠의 [가입하기] | [목록] 버튼 처리
	//	[가입하기] 클릭 /ddit/09/insertMemberInfo.jsp 요청 처리
	//	 가입처리 후 loginForm.jsp로 리다이렉트 처리
	//6. memberList.jsp에서 특정 회원정보 클릭 후 main.jsp 내 컨텐츠 영역에 memberView.jsp 컨텐츠 출력
	//	[수정하기] | [삭제(탈퇴)] | [목록] 버튼 처리


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://storage.googleapis.com/code.getmdl.io/1.0.6/material.indigo-pink.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".mdl-layout__container {\r\n");
      out.write("\twidth: 240px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t\tUI 레이아웃을 구성을 위해 활용되는 jsp 액션태그\r\n");
      out.write("\t\t\t\t   include 액션 태그 : UI 레이아웃 구성을위해 활용\r\n");
      out.write("\t\t\t\t   page 속성에 선언된 해당 jsp로 포워드 처리 후\r\n");
      out.write("\t\t\t\t        해당 jsp가 응답객체의 출력버퍼에 저장한 응답 컨텐츠를 include 액션 태그가 선언된 코드라인에 추가 \r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/09/layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p style=\"clear: both;\"></p>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"content\" style=\"height: 600px; margin-left: 250px; overflow: scroll;\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, contentPage , out, false);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</center>\r\n");
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