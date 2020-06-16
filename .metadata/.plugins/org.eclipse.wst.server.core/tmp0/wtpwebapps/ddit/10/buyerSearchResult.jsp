<%@page import="kr.or.ddit.vo.BuyerVO"%>
<%@page import="kr.or.ddit.buyer.service.BuyerServiceImpl"%>
<%@page import="kr.or.ddit.buyer.service.IBuyerService"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="kr.or.ddit.vo.ZipcodeVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String buyer_id= request.getParameter("buyer_id");
	Map<String,String> params = new HashMap<String,String>();
	params.put("buyer_id", buyer_id);
	
	//웹 애플리케이션 : 테이블 1개당 service, dao, vo가 하나씩 맵핑.
	IBuyerService service = BuyerServiceImpl.getInstance();
	List<BuyerVO> buyerList = service.buyerList(params);

	ObjectMapper jsonDataConvertor = new ObjectMapper();
	String jsonData = jsonDataConvertor.writeValueAsString(buyerList);
	out.print(jsonData);
%>
