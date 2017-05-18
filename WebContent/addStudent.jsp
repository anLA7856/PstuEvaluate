<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addStudent.jsp' starting page</title>
    
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
  <table>
      <s:form action="addStuAction.action" theme="simple" method="post">
    <tr>
    <td>学号</td>
    <td><s:textfield name="s_id" ></s:textfield></td>
    </tr>
     <tr>
    <td>姓名</td>
    <td><s:textfield name="s_name" ></s:textfield></td>
    </tr>
     <tr>
    <td>所在院</td>
    <td><s:select name="s_yuan"  list="{'计算机','金融','物电'}" align="left"></s:select></td>
    </tr>
     <tr>
    <td>所在系</td>
    <td><s:select name="s_zhuan"  list="{'软件','网络','通信'}" align="left"></s:select></td>
    </tr>
     <tr>
    <td>班级</td>
    <td><s:select name="s_ban"  list="{'1','2','3'}" align="left"></s:select></td>
    </tr>  
    <tr>
     <td><s:submit value="保存"></s:submit></td>
    </tr>
    </s:form> 
    </table>
  </body>
</html>
