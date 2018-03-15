<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="asideSize_me">
	<form action="<%=request.getContextPath()%>/kat/menuForm/MenuUpdate.do?no=${MenuInfoUpdate.menu_no}&menuphoto=${MenuInfoUpdate.file_menuphoto}"
		method="post" name="addform" enctype="multipart/form-data">
		<div id="Add" class="Tabs">
			<div id="add_search_border">
				<div id="add_search_header">※ 메뉴정보 수정</div>
				<ul>
					<li id="add_seat">※ 메뉴이름 수정</li>
					<li class="textstyle"><input type="text" id="menuname"
						name="menu_name"></li>
				</ul>
				<ul>
					<li id="add_seat">※ 메뉴가격 수정</li>
					<li class="textstyle"><input type="number" id="menuprice"
						name="menu_price" min="0" max="1000000" value="0"></li>
				</ul>
				<ul>
					<li id="add_seat">※ 메뉴종류 수정</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="B" class="default"> 뷔페 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="W" class="companybtn"> 양식 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="K" class="Universitybtn"> 한식 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="C" class="Universitybtn"> 중식 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="J" class="Universitybtn"> 일식 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="F" class="Universitybtn"> 퓨전 &nbsp;</li>
				</ul>
				<ul>
					<li id="add_menu_updatestyle"></li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="D" class="Universitybtn"> 디저트 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="M" class="Universitybtn"> 멕시칸 &nbsp;</li>
					<li><input type="radio" id="category" name="menu_catagory"
						value="E" class="Universitybtn" checked> 기타 &nbsp;</li>
				</ul>

				<ul>
					<li id="add_seat">※ 메뉴 사진수정</li>
					<li class="filebox bs3-primary preview-image"><input
						class="upload-name" value="파일을 선택해주세요!" disabled="disabled"
						style="width: 200px;"> <label for="input_file">파일
							업로드</label> <input type="file" id="input_file" class="upload-hidden"
						name="menuPhotoFile"></li>
				</ul>
				<ul id="btnstyle">
					<li><input type="submit" id="Registration" name="seatbtn"
						value="등록"></li>
					<li><input type="reset" id="reset" name="resetbtn" value="초기화"></li>
				</ul>
			</div>
		</div>
	</form>

	<div id="Add" class="Tabs">
		<div id="seat_list">
			<div id="add_search_header">선택된 수정 메뉴</div>
			<table class="List_menu_up">
				<tr>
					<td></td>
					<td>메뉴 이름</td>
					<td>메뉴 금액</td>
					<td>메뉴 사진</td>
				</tr>
				<tr class="listInfo" id="btnstyleSeat">
					<td><input type="checkbox" checked="checked"></td>
					<td>${MenuInfoUpdate.menu_name}</td>
					<td>${MenuInfoUpdate.menu_price} 원</td>
					<td><img alt="이미지 없음" id="seatSize"
						src="<%=request.getContextPath()%>/uploadfile/menuphoto/${MenuInfoUpdate.file_menuphoto}"></td>
				</tr>
			</table>
		</div>
	</div>


</div>