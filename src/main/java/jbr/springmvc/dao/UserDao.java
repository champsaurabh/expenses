package jbr.springmvc.dao;

import java.util.ArrayList;

import jbr.springmvc.model.Expense;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserDao {

  int register(User user);
  
  String update(Expense expense);
  
  ArrayList<Expense> displayALl(Expense users1);
  
  ArrayList<Expense> displayyear(Expense users1);
  
  ArrayList<Expense> displaymonth(Expense users1);

  User validateUser(Login login);

  int update1(Login login);
  
  int update2(Login login);
}
