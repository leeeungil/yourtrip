<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<footer id="magintop">
	<hr>
	<br>
	<div id="footer_site">
		<ul>
			<li><a href="#" target="_blank">제휴문의</a> | </li>
			<li><a href="#" target="_blank">고객센터</a> |</li>
			<li><a href="<%=request.getContextPath()%>/kat_main.do"><img src="<%=request.getContextPath()%>/img/icon1.png">카카오톡</a> |</li>
			<li><a href="<%=request.getContextPath()%>/kat_main.do"><img src="<%=request.getContextPath()%>/img/naverLine.png">Line</a></li>
		</ul>
		<br>
		<hr>
		<br> <br>
	</div>
	<div id="footer_sitemap">
		<ul>
			<li>이용약관 |</li>
			<li>개인정보 취급방침 |</li>
			<li>사업자 정보확인</li>
		</ul>
	</div>
	<br>
	<div id="footer_address">
		<span>상호명 : favicontrip.sro </span> | <span>대표자 : EU LINES</span><br> | <span>KAKAO TALK:EULINES</span><br> |
		email : EULINES@naver.com | 개인정보 관리 책임자 : EU LINES | <span>TEL :+420 731 880 025(프라하)</span> |
		<span>계좌 : 하나은행 493-910096-77707</span> |<span> 예금주 : 노금랑</span> |
		<c:if test="${user_id == null}">
			<a
				href="<%=request.getContextPath()%>/master/kat_master/master.do">관리자</a>
		</c:if>
	</div>
	<br> <br>
	<div id="copyright">Copyright ⓒ EU LINES All right reserved</div>
	<br> <br> <br>
</footer>
