package com.kat.seat.dao;

import java.util.List;

import com.kat.seat.model.InfoShopAddress;
import com.kat.seat.model.InfoShopSearch;
import com.kat.seat.model.MenuInfo;
import com.kat.seat.model.ShopPhoto;

public interface MenuDao {

	// 메뉴 데이터 등록
	public void insertMenu(MenuInfo menuInfo);

	// 메뉴 리스트 수
	public int menuSelectCount(String id);

	// 메뉴 리스트 담기
	public List<MenuInfo> menuList(String id, int firstRow, int messageCountPerPage);

	// 수정할 데이터 가져오기
	public MenuInfo getMenuinfo(int no);

	// 메뉴 (수정)업데이트
	public void menuUpdate(MenuInfo menuInfo);

	// 메뉴 삭제
	public void menudelete(int no);
	
	// 매장 사진등록
	public void insertshop(ShopPhoto shopPhoto);

	// 등록된 매장 사진수
	public int shopCount(String userid);

	// 등록된 매장 리스트로 가져오기
	public List<ShopPhoto> shopPhotoList(String userid, int firstRow, int totalCount);

	// 매장 사진 삭제
	public void shopPhotodelete(int no);

	// 검색어 키를 이용해서 매장 사진 리스트 뽑기
	public List<ShopPhoto> shopSearchList(String administrator, int firstRow, int endRow);

	// company_no 가져오기
	public int company_no(String userid);

	// 키워드로 검색한 리스트 수
	public int shopCountList(String keyword);

	// 키워드로 겁색한 리스트 담기
	public List<InfoShopSearch> shopSearch(String keyword, int firstRow, int searchPerPage);

	
	
	// 메뉴로 검색한 리스트 수
	public int shopCountList2(String menu);

	// 메뉴로 검색한 리스트 담기
	public List<InfoShopSearch> shopSearch2(String menu, int firstRow, int searchPerPage);

	// 지역으로 검색한 리스트 수
	public int shopCountList3(String area);

	// 지역으로 검색한 리스트 담기
	public List<InfoShopSearch> shopSearch3(String area, int firstRow, int searchPerPage);

	// 지역 / 키워드 입력 리스트 수
	public int shopCountList4(String area, String keyword);

	// 지역 / 키워드 입력 리스트 담기
	public List<InfoShopSearch> shopSearch4(String area, String keyword, int firstRow, int searchPerPage);

	// 메뉴 / 키워드 입력 리스트 수
	public int shopCountList5(String menu, String keyword);

	// 메뉴 / 키워드 입력 리스트 담기
	public List<InfoShopSearch> shopSearch5(String menu, String keyword, int firstRow, int searchPerPage);

	// 지역 / 메뉴종류 리스트 수
	public int shopCountList6(String area, String menu);

	// 지역 / 메뉴종류 리스트 담기
	public List<InfoShopSearch> shopSearch6(String area, String menu, int firstRow, int searchPerPage);

	// 지역 / 메뉴종류 / 키워드 리스트 수
	public int shopCountList7(String area, String menu, String keyword);

	// 지역 / 메뉴종류 / 키워드 리스트 담기
	public List<InfoShopSearch> shopSearch7(String area, String menu, String keyword, int firstRow, int searchPerPage);

	// 매장 주소 / 이름 가져오기
	public InfoShopAddress getShopAddress(String searchName);

	// 접속 아이디가 사업자인지 확인하기
	public String getCategory(String userid);

	
	
	public int shopCount2(String userid);

	public InfoShopAddress getShopAddress2(String id,int pageNumber);

	public List<ShopPhoto> shopPhotoList2(String userid, int firstRow, int totalCount);

	public int menuSelectCount2();

	public List<MenuInfo> menuList2( int firstRow, int messageCountPerPage);

	

}
