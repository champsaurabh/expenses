package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;


@Controller
public class LoginController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());

    return mav;
  }
  
  /* <bean id="datasource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
  <property name="driverClassName" value="com.mysql.jdbc.Driver" />
  <property name="url" value="jdbc:mysql://localhost:3306/spring_mvc?serverTimezone=UTC" />
	<property name="username" value="root" />
	<property name="password" value="" />
  </bean>  */
  
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) throws Exception {
    ModelAndView mav = null;

    User user = userService.validateUser(login);
    
    if (null != user) {
      mav = new ModelAndView("highnote");
      mav.addObject("firstname", user.getFirstname());
      mav.addObject("grocery", user.getExpname());
      mav.addObject("online_shopping", user.getExpamt());
      mav.addObject("other_expenses", user.getScore());
      
    } else {
      mav = new ModelAndView("login");
      mav.addObject("message", "Username or Password is wrong ........!!");
    }

    return mav;
  }



}
