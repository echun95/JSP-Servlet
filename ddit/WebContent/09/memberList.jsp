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
<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>
<script type='text/javascript' src='/ddit/js/common/validation.js'></script>
<script type="text/javascript">
	$(function(){
		$('table tr:gt(0)').click(function(){
			var mem_id = $(this).find('td:eq(0)').text();
			location.replace('<%=request.getContextPath()%>/09/main.jsp?contentPage=/09/memberView.jsp?mem_id='+ mem_id);
	});
});
</script>
</head>
<body>
<div id="list">
	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp" style="width: 100%;">
		<thead>
			<tr>
				<th class="mdl-data-table__cell--non-numeric">아이디</th>
				<th class="mdl-data-table__cell--non-numeric">패스워드</th>
				<th class="mdl-data-table__cell--non-numeric">이름</th>
				<th class="mdl-data-table__cell--non-numeric">주민번호1</th>
				<th class="mdl-data-table__cell--non-numeric">주민번호2</th>
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
		</tbody>
	</table>
</div>
<div class="searchForm" align="right" style="margin-top: 10px;">
	<form method="post" action="${pageContext.request.contextPath }/18_1/main.jsp?contentPage=boardList.jsp">
		<select name="search_keycode">
			<option value="ALL">전체</option>
			<option value="TITLE">제목</option>
			<option value="CONTENT">컨텐츠</option>
		</select>
		<input type="text" id="search_keyword" name="search_keyword">
		<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" type="submit">검색</button>
		<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" type="button">글쓰기</button>
	</form>
</div>
</body>
</html>







