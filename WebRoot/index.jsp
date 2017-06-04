<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
     <p><a href="<s:url action='hello'/>">Hello World</a></p>
     <!--url tag-->
    <s:url action="hello" var="helloLink">
  　　　　<s:param name="userName">零号芯片</s:param>
　　</s:url>
　　<p><a href="${helloLink}">Hello 芯片</a></p>
	<!-- form tag -->
	<p>Get your own personal hello by filling out and submitting this form.</p>
	<s:form action="hello">
  		<s:textfield name="userName" label="Your name" />
  		<s:submit value="Submit" />
	</s:form>
	<!-- register -->
	<s:url action="registerInput" var="registerInputLink" />
	<p><a href="${registerInputLink}">Please register</a> for our prize drawing.</p>
	
	<!-- 全局属性文件 -->
	<hr />
	<s:text name="contact" />
	
	<!--浏览器插件-->
	<hr>
	<a href='<s:url action="index" namespace="">
				<s:param name="debug">browser</s:param>
			 </s:url>
			'>Launch the configuration browser</a>
			
	<!-- Form 标签 -->
	<br><br>
	<a href="<s:url action="editInput"/>">Form Tag</a>
</body>
</html>