/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-09 06:18:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._05;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URL;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import oracle.jdbc.driver.OracleDriver;

public final class application_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	// 로그(trace -> info -> warn -> debug -> error ->fatal)
	application.log("info 레벨의 이클립스 내 콘솔 방향 출력");
	application.log("실제 서버 배포 및 서비스 : info 레벨의 서버 인스톨 폴더/logs/파일 방향 출력 ");
	//응답 객체의 출력버퍼(저장소)에 해당 문자열을 저장 처리.
	out.println("oracleDriver : " + application.getInitParameter("oracleDriver")+"<br/>");;
	out.println("oracleURL : " + application.getInitParameter("oracleURL")+"<br/>");
	out.println("mysqlDriver : " + application.getInitParameter("mysqlDriver")+"<br/>");
	out.println("mysqlURL : " + application.getInitParameter("mysqlURL")+"<br/>");
	out.println("웹 애플리케이션 배포 및 서비스 경로 : " + application.getRealPath("")+"<br/>");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("OracleDriver :  ");
      out.print(application.getInitParameter("oracleDriver") );
      out.write("<br/>\r\n");
      out.write("OracleURL :  ");
      out.print(application.getInitParameter("oracleURL") );
      out.write("<br/>\r\n");

	String buffer = "";
	BufferedReader reader = new BufferedReader(
										new InputStreamReader(
												new FileInputStream(
														application.getRealPath("/05/readme.txt")),"UTF-8"));
	while((buffer = reader.readLine())!=null){

      out.write("\r\n");
      out.write("\t\t");
      out.print(buffer );
      out.write('\r');
      out.write('\n');

	}
	
	String temp ="";
	//http://localhost/ddit/05/readme.txt
	URL url = application.getResource("/05/readme.txt");
	BufferedReader urlReader = new BufferedReader(
										new InputStreamReader(
												url.openStream(),"UTF-8"));
	
	while((temp = urlReader.readLine())!=null){
		out.println(temp);
	}
	
	

      out.write("\r\n");
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