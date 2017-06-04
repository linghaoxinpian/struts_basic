<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
  </head>
  <body>
  	<h1><s:text name="greeting" /></h1>
    <h2><s:property value="messageStore.message" /></h2>
    <!-- 显示helloCount的值 -->
    <p>I've said hello <s:property value="helloCount" /> times!</p>
    <!-- toString -->
    <p><s:property value="messageStore" /></p>
  </body>
</html>