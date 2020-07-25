package jbr.springmvc.controller;


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.List1;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;
@Controller
public class DisplayController {
  @Autowired
  public UserService userService;
  
  @RequestMapping(value = "/display1", method = RequestMethod.GET)
  public ModelAndView displaydetails(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {	
	int score=userService.update(login);
	ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("display", new List1());
    mav.addObject("score", score);
    return mav;
  }
  
  @RequestMapping(value = "/display2", method = RequestMethod.GET)
  public ModelAndView displaydetails2(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {	
	int score=userService.update1(login);
	ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("display", new List1());
    mav.addObject("score", score);
    return mav;
  }
  
  @RequestMapping(value = "/display3", method = RequestMethod.GET)
  public ModelAndView displaydetails3(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {	
	int score=userService.update2(login);
	ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("display", new List1());
    mav.addObject("score", score);
    return mav;
  }
  
  @RequestMapping(value = "/highnote", method = RequestMethod.GET)
  public ModelAndView refreshpage(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {	
	//userService.update(login);
	ModelAndView mav = new ModelAndView("highnote");
    mav.addObject("display", new List1());
    return mav;
  }
  
  @RequestMapping(value = "/displayprocess", method = RequestMethod.POST)
  public ModelAndView taskList(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("display") ArrayList<User> users1) {
	  
	  ArrayList<User> users2 =userService.displayALl(users1);
	  
	  ModelAndView mav1 = new ModelAndView("display");
	  mav1.addObject("obj2", "none");
	  mav1.addObject("obj", users2);
	  
	  return mav1;
  }
  int n=1;
  @RequestMapping(value = "/hide_show", method = RequestMethod.GET)
  public ModelAndView hideshow(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("display") ArrayList<User> users1) {	
	//userService.update(login);
	String obj="block";
	if(n==1){
		obj="block";
		n=2;
	}else{
		obj="none";
		n=1;
		
	}
	
	ArrayList<User> users2 =userService.displayALl(users1);
	ModelAndView mav = new ModelAndView("display");
    mav.addObject("obj2",obj);
    mav.addObject("obj", users2);
    return mav;
  }
  
  
  
}