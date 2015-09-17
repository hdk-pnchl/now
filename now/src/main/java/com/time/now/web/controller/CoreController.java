package com.time.now.web.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.time.now.entity.banner.BannerData;
import com.time.now.service.CoreService;

@Controller
@RequestMapping("/core")
public class CoreController{
	@Autowired
	private CoreService	coreService;
	
	@RequestMapping(value= "/*", method= RequestMethod.GET)
	public ModelAndView welcomePage(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model= new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;
	}
	
	@RequestMapping(value= "/admin**", method= RequestMethod.GET)
	public ModelAndView adminPage(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model= new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping(value= "/dba**", method= RequestMethod.GET)
	public ModelAndView dbaPage(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model= new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Database Page!");
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping(value= "/print", method= RequestMethod.GET)
	public String printWelcome(ModelMap model){
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}
	
	@RequestMapping(value= "/fetchBannerData", method= RequestMethod.GET)
	@ResponseBody
	public BannerData fetchBannerData(HttpServletRequest request, HttpServletResponse response){
		BannerData bannerData= coreService.fetchBannerData();
		return bannerData;
	}
	
	  @RequestMapping(value="/login", method = RequestMethod.GET)
	  public String printWelcome(ModelMap model, Principal principal ) {
	 
	      String name = principal.getName(); //get logged in username
	      model.addAttribute("username", name);
	      return "hello";
	 
	  }	
}