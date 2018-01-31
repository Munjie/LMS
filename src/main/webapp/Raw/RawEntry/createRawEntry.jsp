<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>无标题文档</title>
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
<form action="/addRowentry.do" method="post">
<fieldset>
    <h1>新增原料入库表</h1>
    <p>
        <label>入库单号</label>
        <input class="sf" name="entrynum" type="text" />
        <span class="field_desc">Field description</span>
    </p>
    <p>
        <label>发货单位</label>
        <select name="deliverycompany" class="dropdown">

            <c:forEach items="${company}" var="com">
            <option value="${com.id}">${com.name}</option>
            </c:forEach>
        </select>
    </p>
    <p>
        <label>委托方</label>
        <select name="client" class="dropdown">

            <c:forEach items="${company}" var="com">
                <option value="${com.id}">${com.name}</option>
            </c:forEach>
        </select>
    </p>
    <p>
        <label>车牌号</label>
        <input class="sf" name="carnum" type="text" />
        <span class="field_desc">Field description</span>
    </p>
    <p>
        <label>烟叶年度</label>
        <input class="sf" name="producingyear" type="text"/>
        <span class="field_desc">Field description</span>
    </p>
    <p>
        <label>烟叶产地</label>
        <select name="producingarea">
            <c:forEach items="${producingareas}" var="pro">
            <option value="${pro.id}">${pro.name}</option>
            </c:forEach>
        </select>
        <span class="field_desc"></span>
    </p>

    <p>
        <label>仓管员</label>
        <select name="operator">

            <c:forEach items="${users}" var="user">
                <option value="${user.id}">${user.name}</option>
            </c:forEach>
        </select>
        <span class="field_desc"></span>
    </p>
    <p>
        <label>存放仓库</label>
        <select name="storagelocationid" class="dropdown" id="firstlocation">
            <option >请选择库位</option>
            <c:forEach items="${storagelocations}" var="sto">
            <option value="${sto.id}">${sto.name}</option>
            </c:forEach>

        </select>
    </p>
    <p>
        <label>入库日期</label>
        <input name="entrydate" type="date"/>
    </p>

    <p><a class="button_link dialog_link">添加明细</a>	</p>
    <div id="dialog" title="Modals with Hello!">
        <form>
            <p>
                <label for="name">序号:</label>
                <input type="text" name="name" id="sequence"  />
            </p>
            <p>
                <label for="name">抽检单号:</label>
                <input type="text" name="name" id="checknumber"  onblur="querycheckinfo()" value=""/>
            </p>
            <p>
                <label for="email">规格 </label><input type="text" name="email" id="standerd" value=""  />
            </p>
            <p>
                <label for="label">件数 </label>
                <input type="text" name="email2" id="count" value=""  />
            </p>
            <p>
                <label for="label2">库位 </label>
                <select name="storagelocationid" class="dropdown" id="lastlocation" onchange="verifylocation()">
                    <option >请选择库位</option>
                    <c:forEach items="${storagelocations}" var="sto">
                        <option value="${sto.id}">${sto.name}</option>
                    </c:forEach>

                </select>
               <%-- <input type="text" name="email3" id="location" value=""  />--%>
            </p>
            <p>
                <label for="label2">烟叶等级 </label>
                <input type="text" name="email3" id="level" value=""  />
            </p>
            <p>
                <label for="label2">烟叶品种 </label>
                <input type="text" name="email3" id="gator" value=""  />
            </p>
            <p>
                <label for="label2">重量 </label>
                <input type="text" name="email3" id="weight" value=""  />
            </p>
        </form>
    </div>
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
        <tr>
            <td>John Doe</td>
            <td>john.doe@example.com</td>
            <td>johndoe1</td>
            <td>johndoe1</td>
            <td>johndoe1</td>
            <td>johndoe1</td>
            <td>johndoe1</td>
            <td>johndoe1</td>
            <td>
                <a href="#" title="Edit this user" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Pencil.png" alt="" width="16" height="16" /></a>
                <a href="#" title="Preferences" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Preferences.png" alt="" /></a>
                <a href="#" title="Delete this user" class="tooltip table_icon"><img src="../../assets/icons/actions_small/Trash.png" alt="" /></a>
            </td>
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
    <p><input class="button" type="submit" value="Submit" /> <input class="button" type="reset" value="Reset" /></p>
</fieldset>
</form>
</body>
</html>

