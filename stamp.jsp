<%@ page pageEncoding="windows-31j"
         contentType="text/html; charset=windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- スタンプ一覧を表示させるための画面 -->
    <link rel="shortcut icon" href="image/icon.ico">
    <link rel="stylesheet" type="text/css" href="css/stamp.css">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
    <title>スタンプを表示</title>
    <!-- android判定をして画像表示を変えるJS -->
<%--  <script  src="js/OSJudge.js"></script>--%>
</head>
<body>
<c:if test="${sessionScope.qb.judgement[0]=='true'}" var="judge0"/>
<c:if test="${sessionScope.qb.judgement[1]=='true'}" var="judge1"/>
<c:if test="${sessionScope.qb.judgement[2]=='true'}" var="judge2"/>
<c:if test="${sessionScope.qb.judgement[3]=='true'}" var="judge3"/>
<c:if test="${sessionScope.qb.judgement[4]=='true'}" var="judge4"/>
<c:if test="${sessionScope.qb.judgement[5]=='true'}" var="judge5"/>
<c:if test="${sessionScope.qb.judgement[6]=='true'}" var="judge6"/>
<c:if test="${sessionScope.qb.judgement[7]=='true'}" var="judge7"/>
<c:if test="${sessionScope.qb.judgement[8]=='true'}" var="judge8"/>
 <img src="image/logo.png" height="10%" width="100%">
<div class="flex_test-box">
    <div class="flex_test-item">
        <c:if test="${judge0}">
            <p>建築監督</p>
            <img src="image/HW1.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge0}">
            <p>建築監督</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge1}">
            <p>建築</p>
            <img src="image/HW2.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge1}">
            <p>建築</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge2}">
            <p>インテリア</p>
            <img src="image/HW3.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge2}">
            <p>インテリア</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
</div>

<div class="flex_test-box">
    <div class="flex_test-item">
        <c:if test="${judge3}">
            <p>情報処理</p>
            <img src="image/HW4.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge3}">
            <p>情報処理</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge4}">
            <p>ゲーム</p>
            <img src="image/HW5.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge4}">
            <p>ゲーム</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge5}">
            <p>WEB動画</p>
            <img src="image/HW6.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge5}">
            <p>WEB動画</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
</div>


<div class="flex_test-box">
    <div class="flex_test-item">
        <c:if test="${judge6}">
            <p>環境</p>
            <img src="image/HW7.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge6}">
            <p>環境</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge7}">
            <p>バイオ</p>
            <img src="image/HW8.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge7}">
            <p>バイオ</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge8}">
            <p>カード交換</p>
            <img src="image/HW9.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge8}">
            <p>カード交換</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
</div>

<c:if test="${sessionScope.judge=='true'}">
    <p>受付にこの画面を提示してください</p>
    <a href="Confirm.html" class="btn-circle-flat">確認</a>
    <br>
    <br>
</c:if>
<c:if test="${sessionScope.judge=='OK'}">
    <p>もしよろしければアンケートにお答えください</p>
    <a href="https://forms.gle/XdC5eteQuwi9u2dW6" target="_blank " class="btn-circle-flat">アンケートに答える</a>
    <br>
    <br>
</c:if>
<br>
</body>
</html>
