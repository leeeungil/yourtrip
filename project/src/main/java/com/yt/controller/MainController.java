package com.yt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("YT_main.do")
	public String main() {
		System.out.println("mainPage 동작");
		return "YT_MAIN/main";
	}
}