<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>抽检查询</title>
    <link type="text/css" href="../../css/style.css" rel="stylesheet" /> <!-- the layout css file -->
    <link type="text/css" href="../../css/jquery.cleditor.css" rel="stylesheet" />
    <script type='text/javascript' src='../../js/jquery-1.4.2.min.js'></script>	<!-- jquery library -->
    <script type='text/javascript' src='../../js/jquery-ui-1.8.5.custom.min.js'></script> <!-- jquery UI -->
    <script type='text/javascript' src='../../js/cufon-yui.js'></script> <!-- Cufon font replacement -->
    <script type='text/javascript' src='../../js/ColaborateLight_400.font.js'></script> <!-- the Colaborate Light font -->
    <script type='text/javascript' src='../../js/easyTooltip.js'></script> <!-- element tooltips -->
    <script type='text/javascript' src='../../js/jquery.tablesorter.min.js'></script> <!-- tablesorter -->

    <!--[if IE 8]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/IEfix.css" type="text/css" media="screen" />
    <![endif]-->

    <!--[if IE 7]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/IEfix.css" type="text/css" media="screen" />
    <![endif]-->

    <script type='text/javascript' src='../../js/visualize.jQuery.js'></script> <!-- visualize plugin for graphs / statistics -->
    <script type='text/javascript' src='../../js/iphone-style-checkboxes.js'></script> <!-- iphone like checkboxes -->
    <script type='text/javascript' src='../../js/jquery.cleditor.min.js'></script> <!-- wysiwyg editor -->

    <script type='text/javascript' src='../../js/custom.js'></script> <!-- the "make them work" script -->
</head>

<body>
<fieldset>
    <h1>入库表信息</h1>
    <table id="t1" class="normal fullwidth tablesorter">
        <tbody>
        <tr>
            <td>入库单号</td>
            <td>发货单位</td>
            <td>委托方</td>
            <td>车牌号</td>
            <td>烟叶年度</td>
            <td>烟叶产地</td>
            <td>仓管员</td>
            <td>存放仓库</td>
            <td>入库日期</td>
            <td>审核</td>
        </tr>
        <c:forEach items="${mapverify}" var="verify">
        <tr>
            <td>${verify.ENTRYNUM}</td>
            <td>${verify.DELIVERYCOMPANYNAME}</td>
            <td>${verify.CLIENTNAME}</td>
            <td>${verify.CARNUM}</td>
            <td>${verify.PRODUCINGYEAR}</td>
            <td>${verify.PRODUCINGAREA}</td>
            <td>${verify.OPERTERNAME}</td>
            <td>${verify.LOCATIONNAME}</td>
            <td><fmt:formatDate value="${verify.ENTRYDATE}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
            <td><a href="" title="Edit this user" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Pencil.png" alt="" width="16" height="16" /></a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <div align="center"><a href="#">首页</a>
        <a href="#">上一页</a>
        <a href="#">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">下一页</a>
        <a href="#">尾页</a>
    </div>
</fieldset>
</body>
</html>
