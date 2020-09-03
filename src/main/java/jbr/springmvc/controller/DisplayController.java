package jbr.springmvc.controller;


import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Expense;
import jbr.springmvc.model.List1;
import jbr.springmvc.model.Login;
import jbr.springmvc.service.UserService;
@Controller
public class DisplayController {
  @Autowired
  public UserService userService;
  
 /* <property name="url" value="jdbc:mysql://localhost:3306/spring_mvc?serverTimezone=UTC" />
  <property name="username" value="root" />
  <property name="password" value="" />*/
  
  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public ModelAndView addexpense(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("expense", new Expense());
    mav.addObject("grocery", "Grocery");

    return mav;
  } 
  
  @RequestMapping(value = "addprocess", method = RequestMethod.POST)
  public ModelAndView displaydetails(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("expense") Expense expense) {	
	String score=userService.update(expense);
	ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("grocery", score);
    mav.addObject("added", "Your expense has been succesfully added");
    return mav;
  }
  
  @RequestMapping(value = "select_year", method = RequestMethod.POST)
  public ModelAndView displaydetails2(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("filter") Expense users1) {	
	  ArrayList<Expense> users2 =userService.displayyear(users1);
	  String mon="jan";
	  String monno=users1.getExpmonth();
	  String y=users1.getExpyear();
	  String nr="";
	  	if (users2.size()==0) {
			nr="There were no expenses on this date !";
		}
		if (monno.equals("2")) {
			mon="feb";
		}else if (monno.equals("3")) {
			mon="march";
		}else if (monno.equals("4")) {
			mon="april";
		}else if (monno.equals("5")) {
			mon="may";
		}else if (monno.equals("6")) {
			mon="june";
		}else if (monno.equals("7")) {
			mon="july";
		}else if (monno.equals("8")) {
			mon="aug";
		}else if (monno.equals("9")) {
			mon="sept";
		}else if (monno.equals("10")) {
			mon="oct";
		}else if (monno.equals("11")) {
			mon="nov";
		}else if (monno.equals("12")) {
			mon="dec";
		}	  
	  //System.out.println(mon);
	  ModelAndView mav1 = new ModelAndView("display");
	  mav1.addObject("obj2", "none");
	  mav1.addObject("nr", nr);
	  mav1.addObject("month", mon);
	  mav1.addObject("monthno", monno);
	  mav1.addObject("year", y);
	  mav1.addObject("obj", users2);
	  
	  return mav1;
  }
  
  @RequestMapping(value = "show_all", method = RequestMethod.GET)
  public ModelAndView displaydetails3(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("filter") Expense users1) {	
	  ArrayList<Expense> users2 =userService.displaymonth(users1);
	  String mon="";
	  String monno="";
	  String y="";
	  
	  ModelAndView mav1 = new ModelAndView("display");
	  mav1.addObject("month", mon);
	  mav1.addObject("monthno", monno);
	  mav1.addObject("year", y);
	  mav1.addObject("obj2", "none");
	  mav1.addObject("obj", users2);
	  
	  return mav1;
  }
   
  
  @RequestMapping(value = "/add1", method = RequestMethod.GET)
  public ModelAndView addexpense2(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("expense", new Expense());
    mav.addObject("grocery", "Online Shopping");

    return mav;
  } 
  
  @RequestMapping(value = "/add2", method = RequestMethod.GET)
  public ModelAndView addexpense3(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("welcome");
    mav.addObject("expense", new Expense());
    mav.addObject("grocery", "Other Expense");

    return mav;
  } 
  
  @RequestMapping(value = "/highnote", method = RequestMethod.GET)
  public ModelAndView refreshpage(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {	
	//userService.update(login);
	ModelAndView mav = new ModelAndView("highnote");
    mav.addObject("display", new List1());
    return mav;
  }
  
  
  
  /*@RequestMapping(value = "/displayprocess", method = RequestMethod.GET)
  public ModelAndView taskList(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("display") ArrayList<Expense> users1) {
	  
	  ArrayList<Expense> users2 =userService.displayALl(users1);
	  
	  ModelAndView mav1 = new ModelAndView("display");
	  mav1.addObject("obj2", "none");
	  mav1.addObject("filter", new Expense());
	  mav1.addObject("obj", users2);
	  
	  return mav1;
  }*/
  
  int n=1;
  @RequestMapping(value = "/hide_show", method = RequestMethod.GET)
  public ModelAndView hideshow(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("filter") Expense users1) {	
	//userService.update(login);
	String obj="block";
	ArrayList<Expense> users2 =userService.displayALl(users1);
	//ArrayList<Expense> users =userService.displayyear(users1);
	String mon="";
	int monno=1;
    String y="";
	if (users2.size()==0) {
		monno=2;
	}else{
		mon=users2.get(0).getExpmonth();
		monno=users2.get(0).getMonthno();
		//String date=users2.get(0).getDate();
		y=users2.get(0).getExpyear();
	}
	ModelAndView mav = new ModelAndView("display");
    mav.addObject("obj2",obj);
    mav.addObject("year",y);
    mav.addObject("month", mon);
	mav.addObject("monthno", monno);
	mav.addObject("date", " ");
    mav.addObject("filter", new Expense());
    mav.addObject("obj", users2);
    return mav;
  }
  
  
  
}