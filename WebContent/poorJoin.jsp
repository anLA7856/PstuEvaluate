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

<title>贫困生申请</title>

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
	<form action="poorJoinAction.action" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td> <input type="text" name="s_id"/></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="s_name"/></td>
			</tr>
			<tr>
				<td>所在院</td>
				<td><s:select name="s_yuan" list="{'计算机','金融','物电'}"
						align="left"></s:select></td>
			</tr>
			<tr>
				<td>所在系</td>
				<td><s:select name="s_zhuan" list="{'软件','网络','通信'}"
						align="left"></s:select></td>
			</tr>
			<tr>
				<td>班级</td>
				<td><s:select name="s_ban" list="{'1','2','3'}" align="left"></s:select>
				</td>
			</tr>
			</table>
			<table>
				<s:iterator id="poorItemList" value="#request.poorItemList"
					status="">
					<tr>
						<td><s:property value="iType"></s:property>
						</td>
						<s:iterator id="myItemList"
							value="#request.poorItemList.myItemList" status="">
							<td><input type="radio"
								name="<s:property value="iType"></s:property>"
								value="<s:property value="id"></s:property>" /> <s:property
									value="iName"></s:property> <input type="hidden" name="id"
								value="<s:property value="id"></s:property>">
							</td>
						</s:iterator>
					</tr>
				</s:iterator>
			</table>					
		<input type="submit" value="提交">
	</form>

</body>
</html>
