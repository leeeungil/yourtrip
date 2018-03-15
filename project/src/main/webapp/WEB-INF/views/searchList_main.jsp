<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>검색 리스트</title>

<!-- css 가져오기 -->
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/search_css.css">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/home_main_css.css">


</head>
<body>
	<jsp:include page="/WEB-INF/views/kat_main/katHader.jsp"
		flush="false"></jsp:include>
	<main>
	<div class="totalView_search">
		<jsp:include page="/WEB-INF/views/kat_Search/Search_Lsit.jsp"
			flush="false"></jsp:include>
	</div>
	</main>
	<jsp:include page="/WEB-INF/views/kat_main/katFooter2.jsp"
		flush="false"></jsp:include>
</body>
</html>