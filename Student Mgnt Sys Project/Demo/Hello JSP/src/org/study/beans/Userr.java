package org.study.beans;

public class Userr {

    private int usersid;
	private String username;
	private String email;
	
	public Userr(int usersid, String username, String email) {
		super();
		this.usersid = usersid;
		this.username = username;
		this.email = email;
	}
	
	
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
