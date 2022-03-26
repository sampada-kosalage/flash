
public class User {

	  public User(String firstname, String lastname, String email, String username, String city, String phonenumber,
			String gender, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.city = city;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String firstname;
	  private String lastname;
	  private String email;
	  private String username;
	  private String city;
	  private String phonenumber;
	  private String gender;
	  private String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
	

	
}
