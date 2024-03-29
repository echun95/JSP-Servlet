<%@page import="java.util.Map"%>
<%@page import="kr.or.ddit.utiles.CryptoGenerator"%>
<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
   Map<String, String> publicKeyMap = CryptoGenerator.generatePairKey(session);
%>    
<c:set var="publicKeyMap" value="<%=publicKeyMap %>"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<!--Loading KAdmin css 시작 -->
<link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
<link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/jquery-ui-1.10.4.custom.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/animate.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/all.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/main.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/style-responsive.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/zabuto_calendar.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/pace.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/13/styles/jquery.news-ticker.css">
<!--Loading KAdmin css 끝 -->
<!-- summernote 에디터 스타일 파일 시작 -->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.7.1/summernote.css" rel="stylesheet">
<!-- summernote 에디터 스타일 파일 끝 -->
<!-- 부트스트랩 다이얼로그 스타일 파일 시작 -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.7/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
<!-- 부트스트랩 다이얼로그 스타일 파일 끝 -->
</head>
<body >
<div id="header-topbar-option" class="page-header-topbar">
   <nav id="topbar" role="navigation" style="margin-bottom: 0;" data-step="3" 
        class="navbar navbar-default navbar-static-top">
      <div class="navbar-header">
         <button type="button" data-toggle="collapse" data-target=".sidebar-collapse" class="navbar-toggle">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
         </button>
         <a id="logo" href="http://www.ddit.or.kr/images/footer.jpg" class="navbar-brand">
            <span class="logo-text text-yellow" style="font-size: 16px;">(재단법인)대덕인재개발원</span>
         </a>
      </div>
      <div class="topbar-main">
         <a id="menu-toggle" href="#" class="hidden-xs">
            <i   class="fa fa-bars"></i>
         </a>
         <form id="topbar-search" action="" method="" class="hidden-sm hidden-xs">
            <div class="text-white">
               <input type="text"    name="search_keyword" placeholder="검색어 입력" 
                     class="form-control text-yellow"/>
            </div>
         </form>
         <c:if test="${!empty LOGIN_MEMBERINFO }">
            <div class="logoutForm">
               <ul class="nav navbar navbar-top-links navbar-right mbn">
                  <li class="dropdown">
                     <a data-hover="dropdown" href="#" class="dropdown-toggle">
                        <i class="fa fa-bell fa-fw"></i>
                        <span class="badge badge-green">3</span>
                     </a>
                  </li>
                  <li class="dropdown">
                     <a data-hover="dropdown" href="#" class="dropdown-toggle">
                        <i class="fa fa-envelope fa-fw"></i>
                        <span class="badge badge-orange">7</span>
                     </a>
                  </li>
                  <li class="dropdown">
                     <a data-hover="dropdown" href="#" class="dropdown-toggle">
                        <i class="fa fa-tasks fa-fw"></i>
                        <span class="badge badge-yellow">8</span>
                     </a>
                  </li>
                  <li class="dropdown">
                     <a data-hover="dropdown" href="#" class="dropdown-toggle">
                        <img src="${pageContext.request.contextPath }/image/disk.png" alt="" class="img-responsive img-circle" />&nbsp;
                        <span class="hidden-xs">${LOGIN_MEMBERINFO.mem_name }</span>&nbsp;<span class="caret"></span>
                     </a>
                     <ul class="dropdown-menu" role="menu">
                        <li><a href="#"><i class="fa fa-user"></i>프로필관리</a></li>
                        <li><a href="#"><i class="fa fa-calendar"></i>스케줄관리</a></li>
                        <li><a href="#"><i class="fa fa-envelope"></i>쪽지관리&nbsp;&nbsp;<font color="red">3</font></a></li>
                        <li><a href="#"><i class="fa fa-tasks"></i>메일관리&nbsp;&nbsp;<font color="red">5</font></a></li>
                        <li class="divider"></li>
                       <li><a href="${pageContext.request.contextPath }/13/logout.jsp"><i class="fa fa-key"></i>로그아웃</a></li>
                     </ul>
                  </li>
               </ul>
            </div>
         </c:if>
         <c:if test="${empty LOGIN_MEMBERINFO }">
         <div class="loginForm nav navbar navbar-top-links navbar-right"
            style="padding: 10px;">
            <ul>
               <li class="dropdown">
                  <label for="inputName" class="control-label text-yellow">아이디 :</label>
                    <input type="text"    name="mem_id" placeholder="아이디를 입력해주세요." 
                     class="text-yellow" />
                </li>
                <li>&nbsp;&nbsp;</li>
                <li class="dropdown">
                   <label for="inputName" class="control-label text-yellow">패스워드 :</label>
                    <input type="password"    name="mem_pass" placeholder="패스워드를 입력해주세요." 
                     class="text-yellow" />
               </li>
               <li>&nbsp;</li>   
                 <li class="dropdown">
                    <button type="button" class="btn btn-warning btn-sm" id="loginBTN">로그인</button>
                    <button type="button" class="btn btn-debug btn-sm" id="memberRegist">회원가입</button>
                </li>
            </ul>       
         </div>
         </c:if>
      </div>
   </nav>
</div> 
</body>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery-1.8.3.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/13/script/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/13/script/bootstrap-hover-dropdown.js"></script>
<script src="${pageContext.request.contextPath}/13/script/html5shiv.js"></script>
<script src="${pageContext.request.contextPath}/13/script/respond.min.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery.slimscroll.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery.cookie.js"></script>
<script src="${pageContext.request.contextPath}/13/script/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/13/script/custom.min.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery.news-ticker.js"></script>
<script src="${pageContext.request.contextPath}/13/script/jquery.menu.js"></script>
<script src="${pageContext.request.contextPath}/13/script/pace.min.js"></script>
<script src="${pageContext.request.contextPath}/13/script/holder.js"></script>
<script src="${pageContext.request.contextPath}/13/script/responsive-tabs.js"></script>
<script src="${pageContext.request.contextPath}/13/script/zabuto_calendar.min.js"></script>
<!-- summernote 에디터 js 파일 시작 -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.7.1/summernote.js"></script>
<!-- summernote 에디터 js 파일 끝 -->
<!-- 부트스트랩 다이얼로그 js 파일 시작 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.7/js/bootstrap-dialog.min.js"></script>
<!-- 부트스트랩 다이얼로그 js 파일 끝 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/crypto/jsbn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/crypto/rsa.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/crypto/prng4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/crypto/rng.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/validation.js"></script>
<script type="text/javascript">
$(function(){
   $('#loginBTN').click(function(){
      if(!$('input[name=mem_id]').val().validationID()){
         alert("아이디를 바르게 입력해주세요.");
         return;
      }
      if(!$('input[name=mem_pass]').val().validationPWD()){
         alert("패스워드를 바르게 입력해주세요.");
         return;
      }
      
      var modulus = '${publicKeyMap["publicModulus"]}';
      var exponent = '${publicKeyMap["publicExponent"]}';
      
      var rsaObject = new RSAKey();
      rsaObject.setPublic(modulus, exponent);
      
      var encryptID = rsaObject.encrypt($('input[name=mem_id]').val());
      var encryptPWD = rsaObject.encrypt($('input[name=mem_pass]').val());
      
      var $frm = $('<form action="${pageContext.request.contextPath}/13/loginCheck.jsp" method="post"></form>');
      var $inputID = $("<input type='hidden' name='mem_id' value='" + encryptID + "'/>");
      var $inputPWD = $("<input type='hidden' name='mem_pass' value='" + encryptPWD + "'/>");
      
      $frm.append($inputID);
      $frm.append($inputPWD);
      
      $(document.body).append($frm);

      $frm.submit();
   });
});
</script>
</html>









