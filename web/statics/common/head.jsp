<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<%
    String basePath = request.getScheme()
            + "://"
            +request.getServerName()
            +":"
            +request.getServerPort()
            +request.getContextPath()
            +"/"
            ;
    pageContext.setAttribute("basePath",basePath);
%>
<script src="statics/js/jquery-3.5.1.js"></script>
<base href="<%=basePath%>">
<link rel="stylesheet" href="statics/css/style.css">


<link href="statics/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="statics/bootstrap/css/bootstrap-theme.min.css" type="text/css" rel="stylesheet">
<script src="statics/bootstrap/js/bootstrap.min.js"></script>
<div id="bg1" class="bgbox"></div>
<div id="bg2" class="bgbox"></div>
<div id="bg3" class="bgbox"></div>