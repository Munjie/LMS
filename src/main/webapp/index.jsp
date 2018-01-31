<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=us-ascii" />
    <title>Hello! Admin</title>

    <link type="text/css" href="css/style.css" rel="stylesheet" />
    <link type="text/css" href="css/login.css" rel="stylesheet" />

    <script type='text/javascript' src='js/jquery-1.4.2.min.js'></script>	<!-- jquery library -->
    <script type='text/javascript' src='js/iphone-style-checkboxes.js'></script> <!-- iphone like checkboxes -->

    <script type='text/javascript'>
        jQuery(document).ready(function() {
            jQuery('.iphone').iphoneStyle();
        });
    </script>

    <!--[if IE 8]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/loginIEfix.css" type="text/css" media="screen" />
    <![endif]-->

    <!--[if IE 7]>
    <script type='text/javascript' src='js/excanvas.js'></script>
    <link rel="stylesheet" href="css/loginIEfix.css" type="text/css" media="screen" />
    <![endif]-->

</head>
<body>
<div id="line"><!-- --></div>
<div id="background">
    <div id="container">
        <div id="logo">
            <img src="assets/logologin.png" alt="Logo" />
        </div>
        <div id="box">
            <form action="/login.do" method="POST">
                <div class="one_half">
                    <p>username <input name="username"  class="field" onBlur="if (jQuery(this).val() == &quot;&quot;) { jQuery(this).val(&quot;username&quot;); }"/></p>
                    <p><input type="checkbox" class="iphone" /><label class="fix">Remember me</label></p>
                </div>
                <div class="one_half last">
                    <p>password<input type="password"  name="password" class="field" onBlur="if (jQuery(this).val() == &quot;&quot;) { jQuery(this).val(&quot;asdf1234&quot;); }" onClick="jQuery(this).val(&quot;&quot;);">	</p>
                    <p><input type="submit" value="Login" class="login" /></p>
                </div>
            </form>
        </div>

    </div>
</div>
</body>
</html>