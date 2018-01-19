<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <title>Hello! Admin</title>

    <link type="text/css" href="css/style.css" rel="stylesheet" /> <!-- the layout css file -->
    <link type="text/css" href="css/jquery.cleditor.css" rel="stylesheet" />
    <script type="text/javascript" language="javascript">
        function iFrameHeight() {
            var ifm= document.getElementById("iframepage");
            var subWeb = document.frames ? document.frames["iframepage"].document : ifm.contentDocument;
            if(ifm != null && subWeb != null) {
                ifm.height = subWeb.body.scrollHeight;
            }
        }
    </script>
    <script type='text/javascript' src='js/jquery-1.4.2.min.js'></script>	<!-- jquery library -->
    <script type='text/javascript' src='js/jquery-ui-1.8.5.custom.min.js'></script> <!-- jquery UI -->
    <script type='text/javascript' src='js/cufon-yui.js'></script> <!-- Cufon font replacement -->
    <script type='text/javascript' src='js/ColaborateLight_400.font.js'></script> <!-- the Colaborate Light font -->
    <script type='text/javascript' src='js/easyTooltip.js'></script> <!-- element tooltips -->
    <script type='text/javascript' src='js/jquery.tablesorter.min.js'></script> <!-- tablesorter -->
    <!--[if IE 8]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/IEfix.css" type="text/css" media="screen" />
    <![endif]-->

    <!--[if IE 7]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/IEfix.css" type="text/css" media="screen" />
    <![endif]-->

    <script type='text/javascript' src='js/visualize.jQuery.js'></script> <!-- visualize plugin for graphs / statistics -->
    <script type='text/javascript' src='js/iphone-style-checkboxes.js'></script> <!-- iphone like checkboxes -->
    <script type='text/javascript' src='js/jquery.cleditor.min.js'></script> <!-- wysiwyg editor -->

    <script type='text/javascript' src='js/custom.js'></script> <!-- the "make them work" script -->
</head>

<body>
<fieldset>
    <ul class="dash">

        <li class="fade_hover tooltip" title="Write a new article">
            <a href="Raw/RawCheck/createRawCheck.html">
                <img src="assets/icons/dashboard/2.png" alt="" />
                <span>原料抽检</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Check your notes">
            <a href="Raw/RawEntry/createRawEntry.html">
                <img src="assets/icons/dashboard/3.png" alt="" />
                <span>原料入库</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Manage Users (3 new users)">
            <span class="bubble">3</span>
            <a href="#">
                <img src="assets/icons/dashboard/54.png" alt="" />
                <span>原料库存管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Website Statistics">
            <a href="Produce/WeeklySchedule/createWeeklySchedule.html">
                <img src="assets/icons/dashboard/81.png" alt="" />
                <span>周生产计划</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Your server's information">
            <a href="Produce/DailySchedule/createDailySchedule .html">
                <img src="assets/icons/dashboard/21.png" alt="" />
                <span>日生产计划</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="No new warnings">
            <a href="Produce/RawPreparerNotice/createRawPreparerNotice.html">
                <img src="assets/icons/dashboard/25.png" alt="" />
                <span>备料通知</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Latest Downloads">
            <a href="Produce/RawShift/createRawShift.html">
                <img src="assets/icons/dashboard/36.png" alt="" />
                <span>生产投料</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="View all Listings">
            <a href="Product/ProductEntry/createProductEntry.html">
                <img src="assets/icons/dashboard/42.png" alt="" />
                <span>成品库存管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Manage user gallery">
            <a href="Product/ProductShipNotice/createProductShipNotice.html">
                <img src="assets/icons/dashboard/27.png" alt="" />
                <span>成品发货通知</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="47 new messages!">
            <span class="bubble">47</span>
            <a href="Product/ProductShip/createProductShip.html">
                <img src="assets/icons/dashboard/75.png" alt="" />
                <span>发货管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Add / Remove Contacts">
            <a href="#">
                <img src="assets/icons/dashboard/123.png" alt="" />
                <span>班次管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Time Schedule">
            <a href="#">
                <img src="assets/icons/dashboard/14.png" alt="" />
                <span>仓库管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="17 new purchases">
            <span class="bubble">17</span>
            <a href="#">
                <img src="assets/icons/dashboard/80.png" alt="" />
                <span>发货单位管理</span>
            </a>
        </li>

        <li class="fade_hover tooltip" title="Lorem Ipsum">
            <a href="#">
                <img src="assets/icons/dashboard/18.png" alt="" />
                <span>委托方管理</span>
            </a>
        </li>
    </ul> <!-- end dashboard items -->
</fieldset>
</body>
</html>