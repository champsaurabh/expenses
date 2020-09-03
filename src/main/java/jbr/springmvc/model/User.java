package jbr.springmvc.model;

public class User {

  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private int expname;
  private int expamt;
  private int score;
  



  public User(){
	  
  }
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    //System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    System.out.println("firstname: " + firstname);
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    System.out.println("lastname: " + lastname);
    this.lastname = lastname;
  }

 

  public int getExpname() {
	return expname;
  }

  public int getExpamt() {
	return expamt;
 }

 public void setExpamt(int expamt) {
	this.expamt = expamt;
 }

public void setExpname(int expname) {
	this.expname = expname;
	
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}


  
}
