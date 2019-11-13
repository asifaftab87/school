package org.school.controllers;

import org.school.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired
	private PageService pageService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("welcome: "+pageService);
		return "welcome";
	}
}
