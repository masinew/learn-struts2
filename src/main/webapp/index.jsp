<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
    <h2><a href="<s:url action="hello"/>">Hello World Page!!</a></h2>
    
    <s:url action="hello" var="helloLink">
	  <s:param name="userName">Bruce Phillips</s:param>
	</s:url>
	<p><a href="${helloLink}">Hello Bruce Phillips</a></p>
	
	<p>Get your own personal hello by filling out and submitting this form.</p>
	<s:form action="hello">
	  <s:textfield name="userName" label="Your name" />
	  <s:submit value="Submit" />
	</s:form>
	
	<p><a href="<s:url action="register" />">Please register</a> for our prize drawing.</p>
	<a href='<s:url action="index" namespace="config-browser" />'>Launch the configuration browser</a>
	<a href='<s:url action="edit" />'>Edit New Person Object</a>
  </body>
</html>