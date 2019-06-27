package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.entered_date.EnteredDate;
import com.model.pc.PC;
import com.model.pc.PCCategory;
import com.model.pc.cpu.CPUCategory;
import com.model.pc.os.OSCategory;
import com.model.pc.storage.StorageCategory;
import com.model.unit.ByteUnit;
import com.service.CreatePCcreateAtByEnteredDateService;
import com.service.EnteringPCService;

@Controller
@SessionAttributes({"enterPC","enteredDate"})
public class PCEnterController {
	@Autowired
	EnteringPCService enteringPCService;
	@Autowired
	CreatePCcreateAtByEnteredDateService createPCcreateAtByEnteredDateService;

	@RequestMapping(value = "/pc_enter",method = {GET,POST})
	public String PCEnter(Model model) {

		if(model.asMap().get("enterPC") == null) {
			PC pc = new PC();
			model.addAttribute("enterPC", pc);
		}


		if(model.asMap().get("enteredDate")==null) {
			EnteredDate enteredDate = new EnteredDate();
			model.addAttribute("enteredDate", enteredDate);
		}

		model.addAttribute("cpuCategoryOptions", CPUCategory.getOptions());
		model.addAttribute("pcCategoryOptions", PCCategory.getOptions());
		model.addAttribute("osCategoryOptions", OSCategory.getOptions());
		model.addAttribute("storageCategoryOptions", StorageCategory.getOptions());
		model.addAttribute("byteUnitOptions", ByteUnit.getOptions());

		return "/pc_enter";

		}


	@RequestMapping(value = "/pc_enter",params="verify", method = {GET,POST})
    public String verify(
            @Valid @ModelAttribute("enterPC") PC pc,BindingResult result1,
            @Validated @ModelAttribute("enteredDate")EnteredDate enteredDate, BindingResult result2,
            Model model) {
        if (result1.hasErrors()||result2.hasErrors()) {
    		model.addAttribute("cpuCategoryOptions", CPUCategory.getOptions());
    		model.addAttribute("pcCategoryOptions", PCCategory.getOptions());
    		model.addAttribute("osCategoryOptions", OSCategory.getOptions());
    		model.addAttribute("storageCategoryOptions", StorageCategory.getOptions());
    		model.addAttribute("byteUnitOptions", ByteUnit.getOptions());
            return "/pc_enter";
            }
//	    EnteredDate enterDate =  (EnteredDate) model.asMap().get("enteredDate");
//	    if(enterDate.getMonth() != null && enterDate.getDay() != null) {
//	        PC inPC = (PC) model.asMap().get("enterPC");
//	        inPC.setPcCreateAt(
//	        		createPCcreateAtByEnteredDateService.createPCcreateAtByEnteredDate(enterDate));
//	        model.addAttribute("enterPC",inPC);
//	    }

        return "forward:/pc_enter_confirm";
	}


	@RequestMapping(value ="/pc_enter_confirm",method = {GET,POST})
	public String pcEnterConfirm(Model model){
		return "/pc_enter_confirm";
	}

	@RequestMapping(value = "/pc_enter_confirm", params = "revise", method = POST)
    public String revise(Model model) {
        return "forward:/pc_enter";
    }

	@RequestMapping(value = "/pc_enter_confirm", params = "confirm", method = POST)
    public String confirm(Model model) {

		EnteredDate enterDate =  (EnteredDate) model.asMap().get("enteredDate");
	    PC inPC = (PC) model.asMap().get("enterPC");
	    inPC.setPcCreateAt(
	        		createPCcreateAtByEnteredDateService.createPCcreateAtByEnteredDate(enterDate));
	    model.addAttribute("enterPC",inPC);
		PC enterPC = (PC) model.asMap().get("enterPC");
		enteringPCService.enteringPC(enterPC);

		PC pc = new PC();
		model.addAttribute("enterPC",pc);
		EnteredDate enteredDate = new EnteredDate();
		model.addAttribute("enteredDate", enteredDate);
        return "forward:/top";
    }
}
