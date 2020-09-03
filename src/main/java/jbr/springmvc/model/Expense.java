package jbr.springmvc.model;

public class Expense {

  private String username;
  private String password;
  private String expname;
  private String date;
  private String time;
  private String expcat;
  private String expyear;
  private String expmonth; 
  private int monthno;
  private int expamt;



  public Expense(){
	  
  }
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    //System.out.println("username: " + username);
    this.username = username;
  }
 
  public String getExpcat() {
	return expcat;
  }

  public void setExpcat(String expcat) {
	this.expcat = expcat;
  }

  public String getExpname() {
	return expname;
  }

  public int getExpamt() {
	return expamt;
 }

 public void setExpamt(int expamt) {
	 this.expamt = expamt;
 }

 public void setExpname(String expname) {
	 //System.out.println("name: " + expname);
	 this.expname = expname;	
 }

 public String getPassword() {
	return password;
 }

 public void setPassword(String password) {
	this.password = password;
 }

 public String getDate() {
	return date;
 }

 public void setDate(String date) {
	this.date = date;
 }

 public String getTime() {
	return time;
 }

 public void setTime(String time) {
	this.time = time;
 }

public String getExpyear() {
	// TODO Auto-generated method stub
	return expyear;
}

public void setExpyear(String expyear) {
	//System.out.println("year: " + expyear);
	this.expyear = expyear;
}

public String getExpmonth() {
	return expmonth;
}

public void setExpmonth(String expmonth) {
	this.expmonth = expmonth;
}

public int getMonthno() {
	return monthno;
}

public void setMonthno(int monthno) {
	this.monthno = monthno;
}

 

  
}
