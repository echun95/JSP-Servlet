<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.service.MemberServiceImpl"%>
<%@page import="org.apache.catalina.tribes.membership.MemberImpl"%>
<%@page import="kr.or.ddit.member.service.IMemberService"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String,String> params = new HashMap<String,String>();
	params.put("mem_id", "b001");
	
	IMemberService service = MemberServiceImpl.getInstance();
	MemberVO memberInfo = service.memberInfo(params);
	
	//기본객체(9개) 중 저장영역(Scope)을 포함하는 기본객체(4개)
//    pageContext, request, session, application
// 	     저장영역 대상 데이터 저장, 수정, 삭제, 취득시 공통 메서드
//    저장 - 기본객체명.setAttribute(키, 값) : 해당 값은 Object 타입으로 업캐스팅 처리.
// 	     취득 - 기본객체명.getAttribute(키) : 취득한 값은 해당 타입으로 다운캐스팅 후 활용.
// 	     수정 - 기본객체명.setAttribute(기존 동일 키, 상이 값) : 해당 값은 Object 타입으로 업캐스팅 처리.
//	     삭제 - 기본객체명.removeAtribute(키)
	pageContext.setAttribute("pageMemberInfo", memberInfo);
	request.setAttribute("reqMemberInfo",memberInfo);
	session.setAttribute("sesMemberInfo", memberInfo);
	application.setAttribute("appMemberInfo", memberInfo);
	// /ddit -> /
	RequestDispatcher disp = request.getRequestDispatcher("/04/forwardRequest2.jsp");
	disp.forward(request, response);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>