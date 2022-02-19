package com.craig.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.craig.dojosNinjas.models.Dojo;
import com.craig.dojosNinjas.models.Ninja;
import com.craig.dojosNinjas.services.DojoService;
import com.craig.dojosNinjas.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	DojoService dojoService;

	@Autowired
	NinjaService ninjaService;

	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}

	// new ninja form submission
	@PostMapping("/ninja/submit")
	public String sumbitNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "newNinja.jsp";
		} else {
			Ninja tempNinja = ninjaService.createNinja(ninja);
			
			return "redirect:/dojo/" + tempNinja.getDojo().getId();
		}
	}

}
