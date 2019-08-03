package com.SpringRest.SearchAppWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome to my first search app";
	}
}
