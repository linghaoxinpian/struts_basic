<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE>
<html>
  <head>   
    <title>edit.jsp</title>
  </head> 
  <body>
    <s:form action="edit">
    	<s:textfield key="personBean.firstName"/>
    	<s:textfield key="personBean.lastName"/>
    	<s:textfield key="personBean.email"/>
    	<s:textfield key="personBean.gender"/>
    	<s:select key="personBean.sport" list="sports"></s:select>
    	<s:radio key="personBean.gender" list="genders" />
    	<s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName"/>
    	<s:checkbox key="personBean.over21" />
    	<s:checkboxlist key="personBean.carModel" list="carModelAvailable" />
    	<s:submit />
    </s:form>
  </body>
</html>