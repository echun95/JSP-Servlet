/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-22 02:49:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.or.ddit.vo.ProdVO;
import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import java.util.HashMap;
import java.util.Map;

public final class prodView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String prod_id = request.getParameter("prod_id");
	Map<String,String> params = new HashMap<String,String>();
	params.put("prod_id", prod_id);
	IProdService service = ProdServiceImpl.getInstance();
	ProdVO vo = service.prodInfo(params);

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/ddit/06/common/validation.js'></script> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('#btn3').on('click',function(){\r\n");
      out.write("\t\tlocation.replace(\"");
      out.print(request.getContextPath());
      out.write("/10/main.jsp\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$('#btn4').on('click',function(){\r\n");
      out.write("\t\tlocation.replace(\"");
      out.print(request.getContextPath());
      out.write("/10/deleteProdInfo.jsp?prod_id=");
      out.print(prod_id);
      out.write("\");\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".fieldName {text-align: center; background-color: #f4f4f4;}\r\n");
      out.write(".tLine {background-color: #d2d2d2; height: 1px;}\r\n");
      out.write(".btnGroup { text-align: right; }\r\n");
      out.write("td {text-align: left; }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"buyerForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/10/updateProdInfo.jsp\" method=\"post\">\r\n");
      out.write("<table width=\"600\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">상품코드</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" value=\"");
      out.print(vo.getProd_id());
      out.write("\" type=\"text\" id=\"prod_id\" name=\"prod_id\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" value=\"");
      out.print(vo.getProd_id());
      out.write("\" type=\"hidden\" id=\"prod_id\" name=\"prod_id\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_id\">상품코드</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">상품명</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" value=\"");
      out.print(vo.getProd_name());
      out.write("\" id=\"prod_name\" name=\"prod_name\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"hidden\" value=\"");
      out.print(vo.getProd_name());
      out.write("\" id=\"prod_name\" name=\"prod_name\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_name\">상품명</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">상품분류명</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" value=\"");
      out.print(vo.getProd_lgu());
      out.write("\" id=\"prod_lgu\" name=\"prod_lgu\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"hidden\" value=\"");
      out.print(vo.getProd_lgu());
      out.write("\" id=\"prod_lgu\" name=\"prod_lgu\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_lgu\">상품분류명</label>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">거래처코드</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" value=\"");
      out.print(vo.getProd_buyer());
      out.write("\" id=\"prod_buyer\" name=\"prod_buyer\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"hidden\" value=\"");
      out.print(vo.getProd_buyer());
      out.write("\" id=\"prod_buyer\" name=\"prod_buyer\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_buyer\">거래처코드</label>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">매입가</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_cost\" value=\"");
      out.print(vo.getProd_cost());
      out.write("\" name=\"prod_cost\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_cost\">매입가</label>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">소비자가</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_price\" name=\"prod_price\" value=\"");
      out.print(vo.getProd_price());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_price\">소비자가</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"600\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">판매가</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_sale\" name=\"prod_sale\" value=\"");
      out.print(vo.getProd_sale());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_sale\">판매가</label>\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"100px\" height=\"25\">상품설명</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_outline\" name=\"prod_outline\" value=\"");
      out.print(vo.getProd_outline());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_outline\">상품설명</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"300px\" height=\"25\">상품상세설명</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_detail\" name=\"prod_detail\" value=\"");
      out.print(vo.getProd_detail());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_detail\">상품상세설명</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"300px\" height=\"25\">총입고수량</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_qtyin\" name=\"prod_qtyin\" value=\"");
      out.print(vo.getProd_qtyin());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_qtyin\">총입고수량</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"300px\" height=\"25\">재고수량</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_totalstock\" name=\"prod_totalstock\" value=\"");
      out.print(vo.getProd_totalstock());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_totalstock\">재고수량</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"300px\" height=\"25\">안전재고수량</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_properstock\" name=\"prod_properstock\" value=\"");
      out.print(vo.getProd_properstock());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_properstock\">안전재고수량</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"fieldName\" width=\"300px\" height=\"25\">입고일자</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\" id=\"prod_insdate\" name=\"prod_insdate\" value=\"");
      out.print(vo.getProd_insdate());
      out.write("\">\r\n");
      out.write("\t\t\t\t<label class=\"mdl-textfield__label\" for=\"prod_insdate\">입고일자</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"btnGroup\" colspan=\"2\" >\r\n");
      out.write("\t\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\" id=\"btn1\" type=\"submit\">상품정보수정</button>\r\n");
      out.write("\t\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\" id=\"btn2\" type=\"button\">취소</button>\r\n");
      out.write("\t\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\" id=\"btn3\" type=\"button\">목록</button>\r\n");
      out.write("\t\t\t<button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\" id=\"btn4\" type=\"button\">상품정보삭제</button>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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