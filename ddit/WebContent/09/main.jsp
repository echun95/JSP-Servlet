<%@page import="javax.swing.text.AbstractDocument.Content"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
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

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.indigo-pink.min.css">
<script
	src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<style type="text/css">
.mdl-layout__container {
	width: 240px;
}
</style>
</head>
<body>
<center>
	<div id="wrap">
		<div id="header">
			<!-- 
				UI 레이아웃을 구성을 위해 활용되는 jsp 액션태그
				   include 액션 태그 : UI 레이아웃 구성을위해 활용
				   page 속성에 선언된 해당 jsp로 포워드 처리 후
				        해당 jsp가 응답객체의 출력버퍼에 저장한 응답 컨텐츠를 include 액션 태그가 선언된 코드라인에 추가 
			 -->
			<jsp:include page="/09/layout/header.jsp" />
		</div>
		<p style="clear: both;"></p>
		<div>
			<div class="left">
				<jsp:include page="./layout/left.jsp" />
			</div>
			<div id="content" style="height: 600px; margin-left: 250px; overflow: scroll;">
				<jsp:include page="<%=contentPage %>" />
			</div>
		</div>
		<div>
			<jsp:include page="./layout/footer.jsp" />
		</div>
	</div>
</center>
</body>
</html>








