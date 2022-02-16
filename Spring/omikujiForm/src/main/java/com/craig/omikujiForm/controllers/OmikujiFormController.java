package com.craig.omikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
		
		@RequestMapping("/")
		public String Index() {
			return "index.jsp";
		}
		
		@RequestMapping("/showform")
		public String ShowForm() {
			
			return "form.jsp";
		}
		@RequestMapping(value="/submit", method=RequestMethod.POST)
		public String form(HttpSession session,
				@RequestParam(value="number") Integer number,
				@RequestParam(value="city") String city,
				@RequestParam(value="name") String name,
				@RequestParam(value="hobby")String hobby,
				@RequestParam(value="livingthing")String livingthing,
				@RequestParam(value="nicemessage") String nicemessage
				) {
			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("name", name);
			session.setAttribute("hobby", hobby);
			session.setAttribute("livingthing", livingthing);
			session.setAttribute("nicemessage", nicemessage);
			
			return "redirect:/show";	
		}
		@RequestMapping("/show")
		public String displayInfo() {
			
			return "display.jsp";	
		}
		
		
}
