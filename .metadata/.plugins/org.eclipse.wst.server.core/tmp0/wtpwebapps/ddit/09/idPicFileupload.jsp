<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
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
	
	FileItem[] items = wrapper.getFileItemValues("idPic");
	
	// 증명사진의 정보를 데이터베이스 대상 저장 처리 생략..
	Map<String,String> jsonMap = new HashMap<String,String>();
	
	for(FileItem item : items){
		
		File saveFile = new File(GlobalConstant.FILE_PATH, item.getName());
		jsonMap.put("fileName", item.getName());
		item.write(saveFile);
	}
	ObjectMapper mapper = new ObjectMapper();
	String jsonData = mapper.writeValueAsString(jsonMap);
	out.print(jsonData);
	
%>    











