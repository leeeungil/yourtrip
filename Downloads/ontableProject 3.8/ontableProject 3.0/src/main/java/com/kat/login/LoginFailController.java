package com.kat.login;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginFailController {

	@RequestMapping("kat/login/failchk.do")
	public ModelAndView loginfail() throws IllegalStateException, IOException {

		System.out.println("로그 loginfail 컨트롤");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("kat_login/LoginChk");

		return modelAndView;
	}
	
}
