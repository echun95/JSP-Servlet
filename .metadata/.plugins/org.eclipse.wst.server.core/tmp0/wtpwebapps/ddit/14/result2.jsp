<%@page import="kr.or.ddit.global.GlobalConstant"%>
<%@page import="kr.or.ddit.utiles.FileUploadRequestWrapper"%>
<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	FileUploadRequestWrapper wrapper = new FileUploadRequestWrapper(request);
	out.println("mem_id : " + wrapper.getParameter("mem_id")+"<br/>");
	out.println("mem_pass : " + wrapper.getParameter("mem_pass")+"<br/>");
	out.println("mem_name : " + wrapper.getParameter("mem_name")+"<br/>");
	
	FileItem[] items = wrapper.getFileItemValues("files");
	
	for(FileItem item : items){
		out.println("파일<br/>");
		out.println("파일 키 : " + item.getFieldName() + "<br/>");
		out.println("파일 파일명 : " + item.getName() + "<br/>");
		out.println("파일 컨텐츠타입 : " + item.getContentType() + "<br/>");
		out.println("파일 사이즈 : " + item.getSize() + "<br/>");

		//브라우저별 파일 명 전송 처리
		//	d:\temp\a.png or a.png
		// fileName = a.png
		String fileName = FilenameUtils.getName(item.getName());
		File saveFile = new File(GlobalConstant.FILE_PATH, fileName);
		item.write(saveFile);
		
		pageContext.setAttribute("fileName", fileName);
	}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="/files/${fileName }" alt="" width="200px" height="150px" 
	onclick="javascript:location.href='${pageContext.request.contextPath}/14/fileDownload.jsp?fileName=${fileName}';"/>
</body>
</html>









