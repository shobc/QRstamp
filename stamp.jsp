<%@ page pageEncoding="windows-31j"
         contentType="text/html; charset=windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- スタンプ一覧を表示させるための画面 -->
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
    <title>スタンプを表示</title>
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

<table border="1">
        <tr>
            <c:if test="${judge0}">

                <td>
                    <p>建築監督</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge0}">
                <td>
                        <p>建築監督</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge1}">
                <td>
                    <p>建築</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge1}">
                <td>
                        <p>建築</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge2}">
                <td>
                    <p>インテリア</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge2}">
                <td>
                        <p>インテリア</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
        </tr>
        <tr>
            <c:if test="${judge3}">
                <td>
                    <p>情報処理</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge3}">
                <td>
                        <p>情報処理</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge4}">
                <td>
                    <p>ゲームプログラミング</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge4}">
                <td>
                        <p>ゲームプログラミング</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge5}">
                <td>
                    <p>web動画クリエーター</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge5}">
                <td>
                        <p>web動画クリエーター</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
        </tr>
        <tr>
            <c:if test="${judge6}">
                <td>
                    <p>環境テクノロジー</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge6}">
                <td>
                        <p>環境テクノロジー</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge7}">
                <td>
                    <p>バイオテクノロジー</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge7}">
                <td>
                        <p>バイオテクノロジー</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge8}">
                <td>
                    <p>カード交換</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge8}">
                <td>
                    <p>カード交換</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>

        </tr>
    </table><br>
<c:if test="${sessionScope.judge=='true'}">
    <a href="Confirm.html"><input type="submit" value="確認"></a>
</c:if>
<c:if test="${sessionScope.judge=='OK'}">
    <a href="">アンケートに答える</a>
</c:if>
</body>
</html>