<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>评议指标管理</title>

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
	<a href="searchPoorItem.jsp">查询</a>
	<table>
		<tr>
			<td>序号</td>
			<td>指标名称</td>
			<td>指标划分</td>
			<td>指标权重</td>
		</tr>

		<s:if test="#request.poorItemList!=null">
			<s:iterator id="poorItemList" value="#request.poorItemList"
				status="st">
				<tr>
					<td><s:property value="#st.count"></s:property>
					</td>
					<td><s:property value="itType"></s:property>
					</td>
					<td><s:property value="itName"></s:property>
					</td>
					<td><s:property value="itWeight"></s:property>
					</td>
					<td><a href="">修改</a> <a href="">删除</a></td>
				</tr>
			</s:iterator>
		</s:if>
		<s:else>
			<tr>
				<td colspan="5">对不起，没有找到数据</td>
			</tr>
		</s:else>
	</table>
</body>
</html>
