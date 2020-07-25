package jbr.springmvc.model;

public class User {

  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String birthdate;
  private int totscore;
  private int score;
  private int bakescore;
  private int nightscore;


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

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }
  
  public int getScore() {
	return score;
  }

  public void setScore(int score) {
		//System.out.println("score: " + score);
	this.score = score;
  }
  
  public void setBakescore(int bakescore) {
    System.out.println("score: " + bakescore);
	this.bakescore = bakescore;
  }

  public int getBakescore() {
	return bakescore;
  }

  public int getNightscore() {
	return nightscore;
  }
	
  public void setNightscore(int nightscore) {
	this.nightscore = nightscore;
  }

 public int getTotscore() {
	return totscore;
 }

 public void setTotscore(int totscore) {
	this.totscore = totscore;
 }


  
}
