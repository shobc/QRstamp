<%@ page pageEncoding="windows-31j"
         contentType="text/html; charset=windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- �X�^���v�ꗗ��\�������邽�߂̉�� -->
    <link rel="shortcut icon" href="image/icon.ico">
    <link rel="stylesheet" type="text/css" href="css/stamp.css">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
    <title>�X�^���v��\��</title>
    <!-- android��������ĉ摜�\����ς���JS -->
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
            <p>���z�ē�</p>
            <img src="image/HW1.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge0}">
            <p>���z�ē�</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge1}">
            <p>���z</p>
            <img src="image/HW2.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge1}">
            <p>���z</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge2}">
            <p>�C���e���A</p>
            <img src="image/HW3.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge2}">
            <p>�C���e���A</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
</div>

<div class="flex_test-box">
    <div class="flex_test-item">
        <c:if test="${judge3}">
            <p>��񏈗�</p>
            <img src="image/HW4.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge3}">
            <p>��񏈗�</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge4}">
            <p>�Q�[��</p>
            <img src="image/HW5.png" class="picture"  width="100%">
        </c:if>
        <c:if test="${!judge4}">
            <p>�Q�[��</p>
            <img src="image/Transparent.png" class="picture"  width="100%">
        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge5}">
            <p>WEB����</p>
            <img src="image/HW6.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge5}">
            <p>WEB����</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
</div>


<div class="flex_test-box">
    <div class="flex_test-item">
        <c:if test="${judge6}">
            <p>��</p>
            <img src="image/HW7.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge6}">
            <p>��</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge7}">
            <p>�o�C�I</p>
            <img src="image/HW8.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge7}">
            <p>�o�C�I</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
    <div class="flex_test-item">
        <c:if test="${judge8}">
            <p>�J�[�h����</p>
            <img src="image/HW9.png" class="picture"  width="100%">

        </c:if>
        <c:if test="${!judge8}">
            <p>�J�[�h����</p>
            <img src="image/Transparent.png" class="picture"  width="100%">

        </c:if>
    </div>
</div>

<c:if test="${sessionScope.judge=='true'}">
    <p>��t�ɂ��̉�ʂ�񎦂��Ă�������</p>
    <a href="Confirm.html" class="btn-circle-flat">�m�F</a>
    <br>
    <br>
</c:if>
<c:if test="${sessionScope.judge=='OK'}">
    <p>������낵����΃A���P�[�g�ɂ�������������</p>
    <a href="https://forms.gle/XdC5eteQuwi9u2dW6" target="_blank " class="btn-circle-flat">�A���P�[�g�ɓ�����</a>
    <br>
    <br>
</c:if>
<br>
</body>
</html>
