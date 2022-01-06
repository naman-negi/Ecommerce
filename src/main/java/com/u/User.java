package com.u;
import javax.persistence.Entity;  //Below Annotations
import javax.persistence.Table;   //Below Annotations
import javax.persistence.Id;   //Below Annotations
@Entity 
@Table
public class User {
@Id
private String username;
private String password;
public User() {	
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [username=" + username + "]";
}

}
