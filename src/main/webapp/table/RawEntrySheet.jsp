<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
    <p align="center" class="STYLE1">入库单</p>
    <table width="909" height="93" border="0" align="center">

        <tr>
            <td height="35">入库单号：${map.ENTRYNUM}</td>
            <td height="35">仓管员：${map.OPERATOR_}</td>
            <td height="35">入库日期：${map.ENTRYDATE}</td>
        </tr>
        <tr>
            <td height="35">委托方：${map.CLIENT}</td>
            <td height="35">发货单位：${map.DELIVERYCOM}</td>
            <td height="35">车牌号：${map.CARNUM}</td>
        </tr>
        <tr>
            <td height="35">存放仓库：${map.STORAGELOCATION}</td>

        </tr>

    </table>
    <table width="910" height="45" border="0" align="center">
        <tr>
            <td width="449" height="45">烟草产地:${map.PRODUCINGAREA}</td>
            <td width="451" height="45">烟草年度:${map.PRODUCINGYEAR}</td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table width="910" height="193" border="1" class="table" align="center" cellspacing="0" bordercolor="#000000">
        <tr>
            <td width="60"><div align="center">序号</div></td>
            <td width="100"><div align="center">抽检单号</div></td>
            <td width="100"><div align="center">规格</div></td>
            <td width="100"><div align="center">件数</div></td>
            <td width="100"><div align="center">库位</div></td>
            <td width="110"><div align="center">烟叶等级</div></td>
            <td width="110"><div align="center">烟叶品种</div></td>
            <td width="110"><div align="center">重量</div></td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="100">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110">&nbsp;</td>
            <td width="110"><br></td>
        </tr>
    </table>
    </table>
    <table width="857" height="50"  align="center">
        <tr>
            <td width="259" height="44" ><span class="STYLE5">审核人：</span></td>
            <td width="259" ><span class="STYLE5">审核日期：</span></td>
        </tr>
    </table>
</form>

<br>
</body>
</html>

