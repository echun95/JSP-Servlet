<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="kr.or.ddit.vo.LProdVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.prod.service.ProdServiceImpl"%>
<%@page import="kr.or.ddit.prod.service.IProdService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	IProdService service = ProdServiceImpl.getInstance();
	List<LProdVO> list = service.lprodList();
	
	ObjectMapper jsonDataConvertor = new ObjectMapper();
	String jsonData = jsonDataConvertor.writeValueAsString(list); 		
	out.println(jsonData);
%>