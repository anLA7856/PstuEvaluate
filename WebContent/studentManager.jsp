<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息列表</title>
    
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
  <a href="addStudent.jsp">添加</a>
  <a href="searchStudent.jsp">查询</a>
      <table >
         <tr>
            <td>序号</td>
            <td>学号</td>
            <td>姓名</td>
            <td>所在院</td>
            <td>所在系</td>
            <td>班级</td>
            <td>电话</td>
            <td>评分</td>
            <td>等级</td>
         </tr>
      
      <s:if test="#request.stuList!=null">
      <s:iterator id="stuList" value="#request.stuList" status="st">
         <tr>
          <td><s:property value="#st.count"></s:property></td>  
        <td><s:property value="SId"></s:property></td>
         <td><s:property value="SName"></s:property></td>
          <td><s:property value="SYuan"></s:property></td>
           <td><s:property value="SZhuan"></s:property></td>
            <td><s:property value="SBan"></s:property></td>
              <td><s:property value="SPhone"></s:property></td>
                <td><s:property value="SGrade"></s:property></td>
                  <td><s:property value="SRank"></s:property></td>
                 <td>
                    <a href="">修改</a>
                    <a href="">删除</a>
                 </td>
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
