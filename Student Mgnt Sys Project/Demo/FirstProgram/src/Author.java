
public class Author {
	
	private String name;
	private String email;
	private String gender;
	
	
	public Author(String name,String email,char c) {
		}
    public void Author(String name, String email, char c) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}
   public String getEmail() {
		return email;
	}
   public void setEmail(String email) {
		this.email = email;
	}
   public String getGender() {
		return gender;
	}
  public void setGender(String gender) {
		this.gender = gender;
	}
@Override
public String toString() {
	return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
}
  
  public void TestAuthor() {
	  System.out.println("");
  }
  

}
