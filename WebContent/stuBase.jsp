<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stuBase.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 记住加上下面这一句话,否则datetimepicker日期控件无法使用 -->  
    <sx:head/>
  </head>
  
  <body>
  <table>
      <s:form action="" theme="simple" method="post">
    <tr>
    <td>学号</td>
    <td><s:textfield name="s_id" disabled="true"></s:textfield></td>
    </tr>
     <tr>
    <td>姓名</td>
    <td><s:textfield name="s_name" ></s:textfield></td>
    </tr>
     <tr>
    <td>所在院</td>
    <td><s:textfield name="s_yuan" ></s:textfield></td>
    </tr>
     <tr>
    <td>所在专业</td>
    <td><s:textfield name="s_zhuan" ></s:textfield></td>
    </tr>
     <tr>
    <td>班级</td>
    <td><s:textfield name="s_ban" ></s:textfield></td>
    </tr>  
    <tr>
    <td>电话</td>
    <td><s:textfield name="s_phone" ></s:textfield></td>
    </tr>
     <tr>
    <td>评分</td>
    <td><s:textfield name="s_grade" ></s:textfield></td>
    </tr>
     <tr>
    <td>贫困等级</td>
    <td><s:textfield name="s_rank" ></s:textfield></td>
    </tr>
    <td align="left"><s:submit value="修改" align="left" ></s:submit></td>
      </s:form>
      </table>
  </body>
</html>
