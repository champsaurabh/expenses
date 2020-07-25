package jbr.springmvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }
  
  public int update(Login login) {
	 return userDao.update(login);
  }
  
  public int update1(Login login) {
	  return userDao.update1(login); 
  }
  
  public int update2(Login login) {
	  return userDao.update2(login); 
  }
  
  public ArrayList<User> displayALl(ArrayList<User> users1) {
	return userDao.displayALl(users1);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
