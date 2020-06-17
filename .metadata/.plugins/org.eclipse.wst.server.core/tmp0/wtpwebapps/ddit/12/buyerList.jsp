<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.buyer.service.BuyerServiceImpl"%>
<%@page import="kr.or.ddit.buyer.service.IBuyerService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="buyerViewURI" value="/12/main.jsp">
	<c:param name="contentPage" value="/12/buyerView.jsp"></c:param>
</c:url>
<c:url var="buyerFormURI" value="/12/main.jsp">
	<c:param name="contentPage" value="/12/buyerForm.jsp"></c:param>
</c:url>
<%
	IBuyerService service = BuyerServiceImpl.getInstance();
	List<Map<String,String>> buyerListAll = service.buyerListAll();
	request.setAttribute("buyerListAll", buyerListAll);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/common/validation.js'></script>
<script type="text/javascript">
	//마우스클릭이벤트
	$(function(){
		$('table tr:gt(0)').click(function(){
			var buyer_id = $(this).find('td:eq(0)').text();
			location.replace('${buyerViewURI}?buyer_id=' + buyer_id);
		});
		
		$('button[type=button]').click(function(){
			location.replace('${buyerFormURI}');
		});
	})
</script>
</head>
<body>
<div id="list">
	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp" style="width: 100%;">
		<thead>
			<tr>
				<th class="mdl-data-table__cell--non-numeric">거래처코드</th>
				<th class="mdl-data-table__cell--non-numeric">거래처명</th>
				<th class="mdl-data-table__cell--non-numeric">상품분류명</th>
				<th class="mdl-data-table__cell--non-numeric">담당자명</th>
				<th class="mdl-data-table__cell--non-numeric">전화번호</th>
				<th class="mdl-data-table__cell--non-numeric">메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${buyerListAll}">
				<tr>
					<td class="mdl-data-table__cell--non-numeric">${item['BUYER_ID']}</td>
					<td class="mdl-data-table__cell--non-numeric">${item['BUYER_NAME']}</td>
					<td class="mdl-data-table__cell--non-numeric">${item['LPROD_NM']}</td>
					<td class="mdl-data-table__cell--non-numeric">${item['BUYER_CHARGER']}</td>
					<td class="mdl-data-table__cell--non-numeric">${item['BUYER_COMTEL']}</td>
					<td class="mdl-data-table__cell--non-numeric">${item['BUYER_MAIL']}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="searchForm" align="right" style="margin-top: 10px;">
	<form method="post" action="">
		<select name="search_keycode">
			<option value="ALL">전체</option>
			<option value="BUYERID">거래처코드</option>
			<option value="BUYERNAME">거래처명</option>
			<option value="BUYERCHARGER">담당자명</option>
		</select>
		<input type="text" id="search_keyword" name="search_keyword">
		<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" type="submit">검색</button>
		<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" type="button">거래처등록</button>
	</form>
</div>
</body>
</html>







