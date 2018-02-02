<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <title>Hello! Admin</title>

    <link type="text/css" href="css/style.css" rel="stylesheet" /> <!-- the layout css file -->
    <link type="text/css" href="css/jquery.cleditor.css" rel="stylesheet" />
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

<div id="container">
    <div id="bgwrap">
        <div id="primary_left">
            <div id="logo">
                <div class="menu">
                    <p><a href="login.html"><img class="tooltip" title="管理员:${login.username}" src="assets/avatar.png" alt="" /></a><span style="color:white;font-size:25px">${login.name}</span></p>
                    <p>
                    </p>

                    <a class="button_link" href="index.jsp">退出系统</a>
                    <a class="button_link" href="welcome.jsp" target="iframepage">返回首页</a>
                </div>
            </div>

            <div id="menu"> <!-- navigation menu -->
                <ul>
                    <li><a href="#"><img src="assets/icons/small_icons_3/dashboard.png" alt /><span>原料抽检</span></a>
                        <ul>
                            <li><a href="createRawCheck.do" target="iframepage">新增抽检</a></li>
                            <li><a href="Raw/RawCheck/retriveRawCheck.jsp" target="iframepage">查看抽检信息</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/notes.png" alt /><span>原料入库</span></a>
                        <ul>
                            <li><a href="/creteRowentry.do" target="iframepage">新增入库</a></li>
                            <li><a href="Raw/RawEntry/retriveRawEntry.jsp" target="iframepage">查询入库</a></li>
                            <li><a href="/verifyRawentry.do" target="iframepage">审核入库</a></li>

                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/coin.png" alt /><span>原料库存管理</span></a>
                        <ul>
                            <li><a href="Raw/RawStorage/retriveCurrentRawStorage.html" target="iframepage">库存查询</a></li>
                            <li><a href="Raw/RawStorage/carryOverRawStorage.html" target="iframepage">库存结转</a></li>
                            <li><a href="Product/ProductStorage/retriveHistoryProductStorage.html" target="iframepage">历史库存查询</a></li>

                        </ul>
                    </li>

                    <li><a href="#"><img src="assets/icons/small_icons_3/dashboard.png" alt /><span>周生产计划</span></a>
                        <ul>
                            <li><a href="Produce/WeeklySchedule/createWeeklySchedule.html" target="iframepage">新增计划</a></li>
                            <li><a href="Produce/WeeklySchedule/retriveWeeklySchedule.html" target="iframepage">查询计划</a></li>
                            <li><a href="Produce/WeeklySchedule/allWeeklySchedule.html" target="iframepage">审核计划</a></li>

                        </ul>
                    </li>

                    <li><a href="#"><img src="assets/icons/small_icons_3/users.png" alt /><span>日生产计划</span></a>
                        <ul>
                            <li><a href="Produce/WeeklySchedule/allWeeklySchedule.html" target="iframepage">查询周计划</a></li>
                            <li><a href="Produce/DailySchedule/createDailySchedule .html" target="iframepage">新增日计划</a></li>
                            <li><a href="Produce/DailySchedule/retriveDailySchedule .html" target="iframepage">查询日计划</a></li>
                            <li><a href="Produce/DailySchedule/allDailySchedule.html"  target="iframepage">审核日计划</a></li>
                            <li><a href="Produce/ProductOut/createProductOut.html" target="iframepage">新增成品产出单</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/posts.png" alt /><span>备料通知</span></a>
                        <ul>
                            <li><a href="Produce/RawPreparerNotice/createRawPreparerNotice.html" target="iframepage">新增通知</a></li>
                            <li><a href="Produce/RawPreparerNotice/retriveRawPreparerNotice.html" target="iframepage">查询通知</a></li>
                            <li><a href="Produce/RawPreparerNotice/allPreparerNotoce.html" target="iframepage">审核通知</a></li>
                        </ul>
                    </li>

                    <li><a href="#"><img src="assets/icons/small_icons_3/media.png" alt /><span>生产投料</span></a>
                        <ul>
                            <li><a href="Produce/RawPreparerNotice/retriveRawPreparerNotice.html" target="iframepage">查询备料单</a></li>
                            <li><a href="Produce/RawShift/createRawShift.html" target="iframepage">新增投料单</a></li>
                            <li><a href="Produce/RawShift/retriveRawShift.html" target="iframepage">查询投料单</a></li>
                            <li><a href="Produce/RawShift/allRawShift.html" target="iframepage">审核投料单</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/posts.png" alt width="32" height="32" /><span>成品入库</span></a>
                        <ul>
                            <li><a href="Produce/ProductOut/retriveProductOut.html" target="iframepage">查询生产成品出库单</a></li>
                            <li><a href="Product/ProductEntry/createProductEntry.html" target="iframepage">新增成品入库</a></li>
                            <li><a href="Product/ProductEntry/retriveProductEntry.html" target="iframepage">成品入库查询</a></li>
                            <li><a href="Product/ProductEntry/allProductEntry.html" target="iframepage">成品入库审核</a></li>

                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/settings.png" alt /><span>成品库存管理</span></a>
                        <ul>
                            <li><a href="Product/ProductStorage/retriveCurrentProductStorage.html" target="iframepage">库存查询</a></li>
                            <li><a href="Product/ProductStorage/carryOverProductStorage.html" target="iframepage">库存结转</a></li>
                            <li><a href="Product/ProductStorage/retriveHistoryProductStorage.html" target="iframepage">历史库存查询</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/users.png" alt /><span>成品发货通知</span></a>
                        <ul>
                            <li><a href="Product/ProductShipNotice/createProductShipNotice.html" target="iframepage">新增通知</a></li>
                            <li><a href="Product/ProductShipNotice/retriveProductShipNotice.html" target="iframepage">查询通知</a></li>
                            <li><a href="Product/ProductShipNotice/allProductShipNotice.html" target="iframepage">审核通知</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/notes.png" alt /><span>发货管理</span></a>
                        <ul>
                            <li><a href="Product/ProductShipNotice/retriveProductShipNotice.html" target="iframepage">查看发货通知</a></li>
                            <li><a href="Product/ProductShip/createProductShip.html" target="iframepage">新增发货</a></li>
                            <li><a href="Product/ProductShip/retriveProductShip.html" target="iframepage">查询发货</a></li>
                            <li><a href="Product/ProductShip/allProductShip.html" target="iframepage">审核发货</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/media.png" alt /><span>班次管理</span></a>
                        <ul>
                            <li><a href="System/Order/createOrder.html" target="iframepage">添加班次</a></li>
                            <li><a href="System/Order/retriveOrder.html" target="iframepage">查询班次</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/dashboard.png" alt /><span>仓库管理</span></a>
                        <ul>
                            <li><a href="System/Storage/createStorage.html" target="iframepage">添加仓库</a></li>
                            <li><a href="System/Storage/retriveStorage.html" target="iframepage">查询仓库</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/posts.png" alt /><span>发货单位管理</span></a>
                        <ul>
                            <li><a href="System/DeliveryCompany/createDeliveryCompany.html" target="iframepage">添加发货单位</a></li>
                            <li><a href="System/DeliveryCompany/retriveDeliveryCompany.html" target="iframepage">查询发货单位</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><img src="assets/icons/small_icons_3/coin.png" alt /><span>委托方管理</span></a>
                        <ul>
                            <li><a href="System/Client/createClient.html" target="iframepage">添加委托方</a></li>
                            <li><a href="System/Client/retriveClient.html" target="iframepage">查询委托方</a></li>
                        </ul>
                    </li>
                </ul>
            </div> <!-- navigation menu end -->
            <div id="primary_top">
                <p><strong>中国烟草物流系统</strong></p>
            </div>
        </div> <!-- sidebar end -->
        <div id="primary_right">
            <div class="inner">
                <iframe id="iframepage" name="iframepage" src="welcome.jsp" frameBorder="0" scrolling="yes" height="760" width="950">
                </iframe>
            </div>
        </div>
    </div>

</div> <!-- bgwrap -->
</div> <!-- container -->
</body>
</html>
