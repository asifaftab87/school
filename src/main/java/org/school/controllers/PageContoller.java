package org.school.controllers;

import java.util.List;

import org.school.model.Page;
import org.school.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {

	@Autowired
	private PageService pageService;
	
	@RequestMapping(value = "/findAllPages")
	public List<Page> findAllPages(){
		return pageService.findAll();
	}
	
}
