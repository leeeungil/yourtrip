<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>On Table 환영합니다.</title>

<!-- css 가져오기 -->
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/home_main_css.css">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/login_css.css">

<!-- 스크립트 가져오기 -->
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="<%=request.getContextPath()%>/script/login_script.js"></script>

</head>
<body>
	<jsp:include page="/WEB-INF/views/kat_main/katHader.jsp"
		flush="false"></jsp:include>

	<jsp:include page="/WEB-INF/views/kat_tour/tour_Main.jsp"
		flush="false"></jsp:include>

	<jsp:include page="/WEB-INF/views/kat_main/katFooter2.jsp"
		flush="false"></jsp:include>
</body>
</html>