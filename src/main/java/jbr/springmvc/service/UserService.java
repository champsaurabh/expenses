package jbr.springmvc.service;


import java.util.ArrayList;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserService {

  int register(User user);
  
  int update(Login login);
  
  int update1(Login login);
  
  int update2(Login login);
  
  ArrayList<User> displayALl(ArrayList<User> users1);

  User validateUser(Login login);
}
