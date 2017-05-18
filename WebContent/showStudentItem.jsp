<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showStudentItem.jsp' starting page</title>

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
		<tr>
			<td>序号</td>
			<td>指标类型</td>
			<td>指标名称</td>
			<td>权重</td>
		</tr>

		<s:if test="#request.itemTypeList!=null">
			<s:iterator id="itemTypeList" value="#request.itemTypeList"
				status="st" var="aa">
				<tr>
					<td><s:property value="id"></s:property>
					</td>
					<td><s:property value="itType"></s:property>
					</td>
					<td><s:property value="itName"></s:property>
					</td>
					<td><s:property value="itWeight"></s:property>
					</td>
				</tr>
			</s:iterator>
		</s:if>
		<s:else>
			<tr>
				<td colspan="5">对不起，没有找到数据</td>
			</tr>
		</s:else>
		<tr>
		<td><a href="evaluateGradeAction.action?id=${request.id}">评分</a></td></tr>
	</table>
</body>
</html>
