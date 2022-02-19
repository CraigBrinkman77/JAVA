package com.craig.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.craig.dojosNinjas.models.Dojo;
import com.craig.dojosNinjas.services.DojoService;
import com.craig.dojosNinjas.services.NinjaService;

@Controller
public class DojoController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	
	
	@GetMapping("/")
	public String homeReroute() {
		return "redirect:/dojos/new";
	}
	
	// show create dojo Form, and render all dojos
	@GetMapping("/dojos/new")
	public String createDojo(Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		Dojo dojo = new Dojo();
		model.addAttribute("dojo", dojo);
		
 		return "dojoNew.jsp";
	}
	
	// new dojo form submission
	@PostMapping("/dojos/submit")
	public String sumbitNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "dojoNew.jsp";
		}else {
			Dojo tempDojo = dojoService.createDojo(dojo);
			
			return "redirect:/dojo/" + tempDojo.getId();
		}
		}
		
	@GetMapping("/dojo/{id}")
	public String viewOneDojo(@PathVariable("id") Long id, Model model ) {
		Dojo thisDojo = dojoService.findDojo(id);
		model.addAttribute("thisDojo", thisDojo);
		
		return "dojoView.jsp";
	}
	
	
}
