<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h1>查询抽检单</h1>
    <p>
        <label>抽检单号</label>
        <input class="sf" name="sf" type="text" value="small input field" />
        <span class="field_desc">Field description</span>
        <a class="button_link dialog_link">查询</a>
    </p>
    <table id="t1" class="normal fullwidth tablesorter">
        <tbody>
        <tr><td>抽检单号</td><td></td></tr>
        <tr><td>发货单位</td><td></td></tr>
        <tr><td>委托方</td><td></td></tr>
        <tr><td>车牌号</td><td></td></tr>
        <tr><td>烟叶年度</td><td></td></tr>
        <tr><td>烟叶产地</td><td></td></tr>
        <tr><td>烟叶等级</td><td></td></tr>
        <tr><td>烟叶品种</td><td></td></tr>
        <tr><td>抽检员</td><td></td></tr>
        <tr><td>抽检日期</td><td></td></tr>
        </tbody>
    </table>

    <table id="users" class="normal fullwidth tablesorter">
        <thead>
        <tr>
            <th class="header">Name</th>
            <th class="header">Email</th>
            <th class="header">Password</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>3John Doe</td>
            <td>john.doe@example.com</td>
            <td>johndoe1</td>
        </tr>
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
