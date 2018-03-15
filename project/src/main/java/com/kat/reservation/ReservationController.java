package com.kat.reservation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kat.seat.model.SeatInfoListView;
import com.kat.seat.model.ShopPhotoListView;
import com.kat.seat.service.AddMenuService;
import com.kat.seat.service.AddSeatService;

@Controller
public class ReservationController {

	@Autowired
	private AddSeatService addSeatService;

	@Autowired
	private AddMenuService addMenuService;

	@RequestMapping("shopInfoSeat/seatRegister.do")
	public ModelAndView RegisterChoose(@RequestParam(name = "shop") String shop, HttpServletRequest request)
			throws IllegalStateException, IOException {

		System.out.println("로그 Register 컨트롤");
		ModelAndView modelAndView = new ModelAndView();

		SeatInfoListView seatInfoListView = addSeatService.SeatListView(shop); // 리스트 구현
		ShopPhotoListView shopPhotoListView = addMenuService.getshopPhotoList(shop); // 매장 사진 가져오기
		shopPhotoListView.setUser_id(shop); // 매장 ajax 처리

		String userid = (String) request.getSession(false).getAttribute("user_id"); // 로그인한 아이디 집어넣기
		String category = addMenuService.getCategory(userid);

		if (category.equals("business")) {
			
			modelAndView.setViewName("kat_exception/category");
			return modelAndView;
			
		} else {
			
			String chknull = addSeatService.Position(shop);
			
			if (chknull != null) {
				modelAndView.addObject("SeatListPhotoUser", chknull);
			}
			
			modelAndView.addObject("SeatListInfo", seatInfoListView);
			modelAndView.addObject("ShopPhotoList", shopPhotoListView);
			modelAndView.setViewName("shopViewReservation_main");
			return modelAndView;
			
		}
	}

}
