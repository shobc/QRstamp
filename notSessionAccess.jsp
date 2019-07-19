<%@ page pageEncoding="windows-31j"
         isErrorPage="true"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
        <!-- Sessionの値がないのにいろいろなページにアクセスしたときに起きる例外のメッセージを起こすページ -->
        <link rel="stylesheet" type="text/css" href="css/NotPage.css">
        <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
        <title>エラーページ</title>
</head>
<body>
    <h1 class="ExceptionMessage">${pageContext.exception.message}</h1>
</body>
</html>