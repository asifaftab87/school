package org.school.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.school.model.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class StaticService {
	
	
	public static List<Page> getAllPage(HttpServletRequest request){
		ApplicationContext ac = RequestContextUtils.findWebApplicationContext(request);
		System.out.println("context: "+ac);
		PageService ps = ac.getBean(PageService.class);
		System.out.println("ps: "+ps);
		System.out.println("ps: "+ps.findAll());
		return null;
		//return pageService.findAll();
	}

}
