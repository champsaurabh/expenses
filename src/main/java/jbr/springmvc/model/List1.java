package jbr.springmvc.model;

import java.util.ArrayList;

public class List1  {

  private ArrayList<Expense> users1= new ArrayList<Expense>();
  
  public List1() {}
  
  /*public List1(List<User> users1){
      this.users1 = users1;
  }*/
  
  public ArrayList<Expense> getUsers1() {
    return users1;
  }

  public void setUsers1(ArrayList<Expense> users1) {
    System.out.println("username: " + users1);
    this.users1 = users1;
  }

  
}
