package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public String start() {
			return "redirect:/top";
	}

	@RequestMapping(value = "/login")//,method = {GET,POST})
	public String login() {
		return "login";
	}

	


}
