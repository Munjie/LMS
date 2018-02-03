<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
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
    <h1>查询入库表</h1>
    <p>
        <label>入库单号</label>
        <form action="/displayRawentrySheet.do" method="post">
        <input class="sf" name="entrynum" type="text"  />
        <span class="field_desc"></span>
        <%--<a class="button_link dialog_link">查询</a>--%>
        <input type="submit" value="查询">
        </form>
    </p>
    <table id="t1" class="normal fullwidth tablesorter">
        <tbody>
        <c:forEach items="${maplist}" var="map" end="0">
        <tr><td>入库单号</td><td>${map.ENTRYNUM}</td></tr>
        <tr><td>发货单位</td><td>${map.DELIVERYCOMPANYNAME}</td></tr>
        <tr><td>委托方</td><td>${map.CLIENTNAME}</td></tr>
        <tr><td>车牌号</td><td>${map.CARNUM}</td></tr>
        <tr><td>烟叶年度</td><td>${map.PRODUCINGYEAR}</td></tr>
        <tr><td>烟叶产地</td><td>${map.PRODUCINGAREANAME}</td></tr>
        <tr><td>仓管员</td><td>${map.LOCATIONUSER}</td></tr>
        <tr><td>存放仓库</td><td>${map.LOCATIONNAME}</td></tr>
        <tr><td>入库日期</td><td><fmt:formatDate value="${map.ENTRYDATE}" pattern="yyyy-MM-dd"></fmt:formatDate> </td></tr>
        </c:forEach>
        </tbody>
    </table>

    <table id="users" class="normal tablesorter">
        <thead>
        <tr>
            <th>序号</th>
            <th>抽检单号</th>
            <th> 规格 </th>
            <th> 件数 </th>
            <th> 库位 </th>
            <th> 烟叶等级 </th>
            <th> 烟叶品种 </th>
            <th> 重量 </th>
            <th> 操作 </th>
        </tr>
        </thead>
        <tbody>
   <c:forEach items="${maplist}" var="map" varStatus="status">
        <tr>
            <td>${status.index+1}</td>
            <td>${map.CHECKNUM}</td>
            <td>${map.STANDARD_}</td>
            <td>${map.AMOUNT}</td>
            <td>${map.LOCATIONNAME}</td>
            <td>${map.LEVELNAME_}</td>
            <td>${map.TOBACCOCATEGORYNAME}</td>
            <td>${map.WEIGHT}</td>
            <td>
                <a href="#" title="Edit this user" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Pencil.png" alt="" width="16" height="16" /></a>
                <a href="#" title="Preferences" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Preferences.png" alt="" /></a>
                <a href="#" title="Delete this user" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Trash.png" alt="" /></a>
            </td>
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

