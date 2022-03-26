package demoApp;

public class User {
	
	protected int user_id;
	protected String user_name;
	protected String email;
	protected String phone_number;
	protected String password;
	public int getUser_id() {
		
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int user_id, String user_name, String email, String phone_number, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", phone_number="
				+ phone_number + ", password=" + password + "]";
	}
	
	
}