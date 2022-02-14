package com.craig.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DaikichiController {

	@RequestMapping("/daikichi")
	public String daikichi() {
		return "WELCOME!!!!!";
	}
	@RequestMapping("/daikichi/today")
	public String daikichiToday() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String daikichiTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/daikichi/travel/{city}")
	public String daikichiTravel(@PathVariable("city")String city) {
		return "Congratulations! You will soon travel to " + city + "!"; 
	}
	@RequestMapping("/daikichi/lotto/{number}")
	public String daikichiLotto(@PathVariable("number")Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
