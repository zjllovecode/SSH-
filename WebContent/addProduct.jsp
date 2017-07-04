<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addProduct.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>保存商品</h1>
  <s:form method="post" action="product_save" namespace="/" theme="simple">
  		<table border="1" width="400">
  		<tr>
  		<td> 商品名称</td>
  		<td><s:textfield  name="pname"/></td>
  		</tr>
  		<tr>
  		<td> 商品价格</td>
  		<td><s:textfield  name="price"/></td>
  		</tr>
  		<tr>
  		<td colspan="2"><input type="submit" value="添加"/></td>
  		</tr>
  		</table>
  </s:form>
  </body>
</html>
