package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	@RequestMapping(value = "/")
	public String start() {
		return "forward:/login";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/top")
	public String top() {
	return "/top";
	}


}
