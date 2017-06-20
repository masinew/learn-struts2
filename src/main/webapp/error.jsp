<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
	<title>ERROR PAGE</title>
</head>
<body>
	<h4>The application has malfunctioned.</h4>

	<p>Please contact technical support with the following information:</p> 
	
	<h4>Exception Name: <s:property value="exception" /> </h4>
	
	<h4>Exception Details: <s:property value="exceptionStack" /></h4>
</body>
</html>