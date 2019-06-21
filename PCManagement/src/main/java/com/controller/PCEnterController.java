package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PCEnterController {

	@RequestMapping("/pc_enter")
	public String top(Model model) {

		return "/pc_enter_confirm";

		}


	}
