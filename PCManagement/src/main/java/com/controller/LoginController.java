package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public String start() {
			return "redirect:/top";
	}

	@RequestMapping(value = "/login",method = {GET,POST})
	public String login() {
		return "login";
	}

	@RequestMapping("/top")
	public String top() {
	return "/top";
	}


}
