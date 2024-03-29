<%@page import="kr.or.ddit.member.service.MemberServiceImpl"%>
<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.service.IMemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	IMemberService service = MemberServiceImpl.getInstance();
	List<MemberVO> memberList = service.memberList();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type='text/javascript'
	src='http://code.jquery.com/jquery-latest.js'></script>
<script type='text/javascript' src='/ddit/js/common/validation.js'></script>
<script type="text/javascript">
	$(function(){
		$('table tr:gt(0)').click(function(){
			var mem_id = $(this).find('td:eq(0)').text();
			location.replace('<%=request.getContextPath()%>/06/memberView.jsp?mem_id='+ mem_id);});
	});
</script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>성명</th>
				<th>주민등록번호1</th>
				<th>직업</th>
				<th>취미</th>
			</tr>
		</thead>
		<tbody>
			<%
				for(int i=0; i<memberList.size(); i++){
			%>
			<tr>
				<td><%=memberList.get(i).getMem_id()%></td>
				<td><%=memberList.get(i).getMem_name()%></td>
				<td><%=memberList.get(i).getMem_regno1()%></td>
				<td><%=memberList.get(i).getMem_job()%></td>
				<td><%=memberList.get(i).getMem_like()%></td>
			</tr>

			<%
				}
			%>
			<tr>
				<td>
					<a href='<%=request.getContextPath()%>/06/loginForm.jsp'>로그아웃</a>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
