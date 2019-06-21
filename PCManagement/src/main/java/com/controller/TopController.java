package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.pc.PC;
import com.service.CreatePCListService;

@Controller
public class TopController {
	@Autowired
	CreatePCListService createPCListService;

	@RequestMapping("/top")
	public String top(Model model) {
		List<PC> pcList = createPCListService.returnPCList();
		model.addAttribute("pcList",pcList);

	return "/top";

	}


}
