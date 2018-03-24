package com.kat.tour.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kat.seat.model.InfoShopAddress;
import com.kat.seat.model.MenuInfoListView;
import com.kat.seat.model.Search;
import com.kat.seat.model.ShopPhotoListView;
import com.kat.seat.service.AddMenuService;

@Controller
public class tourMainController {
	
	public static Search searchinfo = new Search();
	
	@Autowired
	private AddMenuService addMenuService;

	@RequestMapping("kat/tourMain/tour.do")
	public ModelAndView tourListView(@RequestParam(name = "page", defaultValue = "1") int pageNumber,
			@RequestParam(name = "userid", defaultValue = "1")String user_id,Search search, HttpServletRequest request)
	        throws IllegalStateException, IOException {

				
    	ModelAndView modelAndView = new ModelAndView();
		
    	ShopPhotoListView shopPhotoListView = addMenuService.getshopPhotoList2(user_id);
		MenuInfoListView menuInfoListView = addMenuService.getMenuView2(pageNumber);
		InfoShopAddress infoShopAddress = addMenuService.getAddress2(user_id,pageNumber);
		
		modelAndView.setViewName("tourView_main");
		modelAndView.addObject("pageNumber", pageNumber);
		modelAndView.addObject("ShopPhotoList", shopPhotoListView);
		modelAndView.addObject("menuListInfo", menuInfoListView);
		modelAndView.addObject("InfoShopAddress", infoShopAddress);
		
		return modelAndView;
		
	}
}