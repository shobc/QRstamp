<%@ page pageEncoding="windows-31j"
         contentType="text/html; charset=windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>スタンプを表示</title>
</head>
<body>
<table border="1">
        <tr><td>${qb.judgement[0]}</td><td>${qb.judgement[1]}</td><td>${qb.judgement[2]}</td></tr>
        <tr><td>${qb.judgement[3]}</td><td>${qb.judgement[4]}</td><td>${qb.judgement[5]}</td></tr>
        <tr><td>${qb.judgement[6]}</td><td>${qb.judgement[7]}</td><td></td></tr>
    </table><br>
</body>
</html>