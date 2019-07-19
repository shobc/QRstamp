<%@ page pageEncoding="windows-31j"
         contentType="text/html; charset=windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- �X�^���v�ꗗ��\�������邽�߂̉�� -->
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
    <title>�X�^���v��\��</title>
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
                    <p>���z�ē�</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge0}">
                <td>
                        <p>���z�ē�</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge1}">
                <td>
                    <p>���z</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge1}">
                <td>
                        <p>���z</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge2}">
                <td>
                    <p>�C���e���A</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge2}">
                <td>
                        <p>�C���e���A</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
        </tr>
        <tr>
            <c:if test="${judge3}">
                <td>
                    <p>��񏈗�</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge3}">
                <td>
                        <p>��񏈗�</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge4}">
                <td>
                    <p>�Q�[���v���O���~���O</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge4}">
                <td>
                        <p>�Q�[���v���O���~���O</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge5}">
                <td>
                    <p>web����N���G�[�^�[</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge5}">
                <td>
                        <p>web����N���G�[�^�[</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
        </tr>
        <tr>
            <c:if test="${judge6}">
                <td>
                    <p>���e�N�m���W�[</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge6}">
                <td>
                        <p>���e�N�m���W�[</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge7}">
                <td>
                    <p>�o�C�I�e�N�m���W�[</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge7}">
                <td>
                        <p>�o�C�I�e�N�m���W�[</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${judge8}">
                <td>
                    <p>�J�[�h����</p>
                    <img src="image/Already.png" height="100%" width="100%">
                </td>
            </c:if>
            <c:if test="${!judge8}">
                <td>
                    <p>�J�[�h����</p>
                        <img src="image/Transparent.png" height="100%" width="100%">
                </td>
            </c:if>

        </tr>
    </table><br>
<c:if test="${sessionScope.judge=='true'}">
    <a href="Confirm.html"><input type="submit" value="�m�F"></a>
</c:if>
<c:if test="${sessionScope.judge=='OK'}">
    <a href="">�A���P�[�g�ɓ�����</a>
</c:if>
</body>
</html>