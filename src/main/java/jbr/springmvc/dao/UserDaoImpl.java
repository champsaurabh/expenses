package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;
  
  String usern="";

  public int register(User user) {
    String sql = "insert into users values(?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
        user.getLastname(), user.getBirthdate() });
  }
  
  public int update(Login login) {
	    String sql = "update users set bakescore=bakescore+1 where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    String sql3 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,(score+bakescore+nightscore) AS totscore,score,lastname,password,bakescore,birthdate,nightscore from users where username='" + usern + "'";
	    List<User> users = jdbcTemplate.query(sql3, new UserMapper());
	    usern="";
	    return users.get(0).getTotscore();
	  }
  
  public int update1(Login login) {
	    String sql = "update users set score=score+1 where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    String sql3 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,(score+bakescore+nightscore) AS totscore,score,lastname,password,bakescore,birthdate,nightscore from users where username='" + usern + "'";
	    List<User> users = jdbcTemplate.query(sql3, new UserMapper());
	    usern="";
	    return users.get(0).getTotscore();
	  }
  
  public int update2(Login login) {
	    String sql = "update users set nightscore=nightscore+1 where username='"+usern+"'";
	    //System.out.println("got it:"+usern);
	    jdbcTemplate.update(sql);
	    String sql3 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,(score+bakescore+nightscore) AS totscore,score,lastname,password,bakescore,birthdate,nightscore from users where username='" + usern + "'";
	    List<User> users = jdbcTemplate.query(sql3, new UserMapper());
	    //int sc=jdbcTemplate.query(sql3, new UserMapper());
	    usern="";
	    return users.get(0).getTotscore();
	  }
  
  public ArrayList<User> displayALl(ArrayList<User> users1) {
	  String sql1 = "select username,CONCAT(firstname, ' ',lastname) AS firstname,(score+bakescore+nightscore) AS totscore,score,lastname,password,bakescore,birthdate,nightscore from users";
	  
	  ArrayList<User> users2 = (ArrayList<User>) jdbcTemplate.query(sql1, new UserMapper());
	  //System.out.println(users2);
	  return users2;
  }

  public User validateUser(Login login) {
    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
        + "'";
    usern=login.getUsername();
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
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
    user.setBirthdate(rs.getString("birthdate"));
    user.setTotscore(rs.getInt("totscore"));
    user.setScore(rs.getInt("score"));
    user.setBakescore(rs.getInt("bakescore"));
    user.setNightscore(rs.getInt("nightscore"));

    return user;
  }
}