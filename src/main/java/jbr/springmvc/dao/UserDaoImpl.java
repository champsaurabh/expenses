package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Expense;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;
  
  String usern="";

  public int register(User user) {
    String sql = "insert into users values(?,?,?,?)";
    usern=user.getUsername();
    //System.out.println("name="+usern);
    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
        user.getLastname() });
  }
  
  public User validateUser(Login login) {
	    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
	        + "'";
	    usern=login.getUsername();
	    
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());

	    return users.size() > 0 ? users.get(0) : null;
  }
  
  public String update(Expense expense) {
	    String sql = "INSERT INTO expense(username,password, exp_cat, exp_name, exp_amt) VALUES ('" + usern + "',' ','" + expense.getExpcat() + "','" + expense.getExpname() + "','" + expense.getExpamt() + "')";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    int amt=0;
	    String cat="";
	    if (expense.getExpcat().equals("Grocery")) {
			amt=expense.getExpamt();
			cat="exp_name";
		}else if (expense.getExpcat().equals("Online Shopping")) {
			amt=expense.getExpamt();
			cat="exp_amt";
		}else if (expense.getExpcat().equals("Other Expense")) {
			amt=expense.getExpamt();
			cat="score";
		}
	    String sql2 = "update users set "+cat+"="+cat+"+"+amt+" where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql2);
	    String sql3 = "select * from expense where username='" + usern + "'";
	    List<Expense> users = jdbcTemplate.query(sql3, new UserMapper2());
	    //usern="";
	    return users.get(0).getExpcat();
	  }
  
  public int update1(Login login) {
	    String sql = "update users set score=score+1 where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    String sql3 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,password,exp_name,exp_amt,score from users where username='" + usern + "'";
	    List<User> users = jdbcTemplate.query(sql3, new UserMapper());
	    //usern="";
	    return users.get(0).getExpamt();
	  }
  
  public int update2(Login login) {
	    String sql = "update users set nightscore=nightscore+1 where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    String sql3 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,score,lastname,password from users where username='" + usern + "'";
	    List<User> users = jdbcTemplate.query(sql3, new UserMapper());
	    //int sc=jdbcTemplate.query(sql3, new UserMapper());
	    //usern="";
	    return users.get(0).getExpamt();
	  }
  
  public ArrayList<Expense> displayALl(Expense users1) {
	  String sql1 = "select username,password, exp_cat, exp_name, exp_amt, Cast(time As VarChar(8)),date,exp_amt as mon ,EXTRACT(YEAR FROM date) AS year,to_char(date, 'Month') AS monname from expense where username='"+usern+"' order by date desc LIMIT 30";
	  
	  ArrayList<Expense> users2 = (ArrayList<Expense>) jdbcTemplate.query(sql1, new UserMapper2());
	  System.out.println("here:"+usern);
	  return users2;
  }
  
  public ArrayList<Expense> displayyear(Expense users1) {
	  String sql1 = "select username,password, exp_cat, exp_name, exp_amt, year, Cast(time As VarChar(8)),date,exp_amt as mon ,to_char(date, 'Month') AS monname from expense where username='"+usern+"' and EXTRACT(YEAR FROM date)=" + users1.getExpyear() + " and EXTRACT(MONTH FROM date)='" + users1.getExpmonth() + "' and date='"+users1.getDate()+"' order by date desc";
	  
	  ArrayList<Expense> users2 = (ArrayList<Expense>) jdbcTemplate.query(sql1, new UserMapper2());
	  System.out.println("date:"+users1.getExpyear());
	  System.out.println("month:"+users1.getExpmonth());
	  return users2;
  }
  
  public ArrayList<Expense> displaymonth(Expense users1) {
	  String sql1 = "select username,password, exp_cat, exp_name, exp_amt, Cast(time As VarChar(8)),date,exp_amt as mon ,EXTRACT(YEAR FROM date) AS year,to_char(date, 'Month') AS monname from expense where username='"+usern+"' order by date desc";
	  
	  ArrayList<Expense> users2 = (ArrayList<Expense>) jdbcTemplate.query(sql1, new UserMapper2());
	  //System.out.println("here:"+users2.get(0).getExpcat());
	  return users2;
  }

  

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("username"));
    //user.setNickname(rs.getString("nickname"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setExpname(rs.getInt("exp_name"));
    user.setExpamt(rs.getInt("exp_amt"));
    user.setScore(rs.getInt("score"));

    return user;
  }
}

class UserMapper2 implements RowMapper<Expense> {

	  public Expense mapRow(ResultSet rs, int arg1) throws SQLException {
	    Expense user1 = new Expense();

	    user1.setUsername(rs.getString("username"));
	    //user.setNickname(rs.getString("nickname"));
	    user1.setPassword(rs.getString("password"));
	    user1.setExpname(rs.getString("exp_name"));
	    user1.setDate(rs.getString("date"));
	    user1.setTime(rs.getString("time"));
	    user1.setExpcat(rs.getString("exp_cat"));
	    user1.setExpyear(rs.getString("year"));
	    user1.setExpmonth(rs.getString("monname"));
	    user1.setMonthno(rs.getInt("mon"));
	    user1.setExpamt(rs.getInt("exp_amt"));

	    return user1;
	  }
	}