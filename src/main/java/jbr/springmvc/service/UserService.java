package jbr.springmvc.service;


import java.util.ArrayList;

import jbr.springmvc.model.Expense;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserService {

  int register(User user);
  
  String update(Expense expense);
  
  int update1(Login login);
  
  int update2(Login login);
  
  ArrayList<Expense> displayALl(Expense users1);

  User validateUser(Login login);

  ArrayList<Expense> displayyear(Expense users1);

  ArrayList<Expense> displaymonth(Expense users1);
}
