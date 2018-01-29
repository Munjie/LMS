<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/22
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        <!--
        .STYLE1 {
            font-size: 36px;
            font-weight: bold;
        }
        -->
    </style>
    <link type="text/css" href="style.css" rel="stylesheet" />

</head>

<body>
<form name="form1" method="post" action="">
    <p align="center" class="STYLE1">抽检单</p>
    <table width="900"  align="center">
        <c:forEach items="${rawchecks}" var="rawchecks">
        <tr>
            <td width="300" height="44">抽检单号：${rawchecks.checknum}</td>
            <td width="300">抽检人：${rawchecks.operator}</td>
            <td width="300">抽检日期：<fmt:formatDate  value="${rawchecks.checkdate}" pattern="yyyy-MM-dd" ></fmt:formatDate></td>
        </tr>
        <tr>
            <td width="300" height="44">委托方：${clientName}</td>
            <td width="300">发货单位：${deliverName}</td>
            <td width="300">车牌号：${rawchecks.carnum}</td>
        </tr>
        <tr>
            <td width="225" height="45">烟草品种:${rawchecks.rawtobacco}</td>
            <td width="225" height="45">烟草产地:${rawchecks.rawtobacco}</td>
            <td width="225" height="45">烟草年度:${rawchecks.rawtobacco}</td>
            <td width="225" height="45">烟草等级:${rawchecks.rawtobacco}</td>
        </tr>
        </c:forEach>
    </table>
    <table width="910" height="193" border="1" align="center" class="table" cellspacing="0" bordercolor="#000000">
        <tr>
            <td width="195"><div align="center">序号</div></td>
            <td width="705"><div align="center">抽重</div></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td><div align="center">平均重量</div></td>
            <td><br></td>
        </tr>
    </table>
</form>

<br>
</body>
</html>

