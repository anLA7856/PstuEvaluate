<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
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
  <table align="center">
  <h2 align="center">高校贫困生评定系统登录界面</h2>
    <s:form action="loginAction.action" theme="simple" method="post">
    <tr>
    <td>用户名</td>
    <td><s:textfield name="username" ></s:textfield></td>
       </tr>
       <tr>
       <td>密&nbsp;&nbsp;码</td>
       <td><s:password name="password" ></s:password></td>
       </tr>
       <tr><td>身&nbsp;&nbsp;份</td>
       <td><s:select name="card"  list="{'学生','评定人员'}" align="left"></s:select></td>
       </tr>
       <tr>
       <td align="left"><s:submit value="登录" align="left" ></s:submit></td>
       <td align="right">
       <s:reset value="重置" align="right"></s:reset></td>
       </tr>
    </s:form>
  </table>
  </body>
</html>
