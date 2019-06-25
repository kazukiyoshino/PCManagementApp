package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.pc.PC;
import com.model.pc.PCCategory;
import com.model.pc.cpu.CPUCategory;
import com.model.pc.os.OSCategory;
import com.model.pc.storage.StorageCategory;
import com.model.unit.ByteUnit;

@Controller
public class PCEnterController {

	@RequestMapping(value = "/pc_enter",method = {GET,POST})
	public String PCEnter(@ModelAttribute("enterPC") PC pc,Model model) {

		model.addAttribute("cpuCategoryOptions", CPUCategory.getOptions());
		model.addAttribute("pcCategoryOptions", PCCategory.getOptions());
		model.addAttribute("osCategoryOptions", OSCategory.getOptions());
		model.addAttribute("storageCategoryOptions", StorageCategory.getOptions());
		model.addAttribute("byteUnitOptions", ByteUnit.getOptions());
		return "/pc_enter";

		}

	@RequestMapping(value = "/pc_enter",params="verify", method = POST)
    public String verify(
            @Validated @ModelAttribute("enterPC") PC pc,Errors errors,Model model) {
        if (errors.hasErrors()) {
            return "/pc_enter";
        }
        return "forward:/pc_enter_confirm";
	}

	@RequestMapping(value ="/pc_enter_confirm",method = {GET,POST})
	public String pcEnterConfirm(@ModelAttribute("enterPC") PC pc,Model model){
		return "/pc_enter_confirm";
	}

	@RequestMapping(value = "/pc_enter_confirm", params = "revise", method = POST)
    public String revise() {
        return "forward:/pc_enter";
    }

	@RequestMapping(value = "/pc_enter_confirm", params = "confirm", method = POST)
    public String confirm(@ModelAttribute("enterPC") PC pc) {
		//登録作業をするメソッドを呼び出す

        return "forward:/top";
    }
}
