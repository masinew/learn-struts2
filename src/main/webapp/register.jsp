<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
    <s:head />
  </head>
  <body>
    <h3>Register for a prize by completing this form.</h3>

    <s:form action="register" method="post">
      <s:textfield key="personOldBean.firstName" />
      <s:textfield key="personOldBean.lastName" />
      <s:textfield key="personOldBean.email" />
      <s:textfield key="personOldBean.age" />
      <s:submit/>
    </s:form>	
  </body>
</html>