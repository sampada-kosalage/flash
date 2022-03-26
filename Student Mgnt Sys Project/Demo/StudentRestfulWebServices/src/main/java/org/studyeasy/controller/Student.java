package org.studyeasy.controller;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "student") 

public class Student implements Serializable{
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int birth_date, String displayName, String email, String firstName, String gender, String lastName,
			String location) {
		super();
		this.birth_date = birth_date;
		DisplayName = displayName;
		Email = email;
		FirstName = firstName;
		Gender = gender;
		LastName = lastName;
		Location = location;
	}
	//private static final long serialVersionUID = 1L; 

	private static int birth_date;
	private String DisplayName;
	private String Email;
	private String FirstName;
	private String Gender;
	private String LastName;
	private String Location;
	public static int getBirth_date() {
		return birth_date;
	}
	@XmlElement 
	public void setBirth_date(int birth_date) {
		this.birth_date = birth_date;
	}
	public String getDisplayName() {
		return DisplayName;
	}
	@XmlElement 
	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}
	public String getEmail() {
		return Email;
	}
	@XmlElement 
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	@XmlElement 
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getGender() {
		return Gender;
	}
	@XmlElement 
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLastName() {
		return LastName;
	}
	@XmlElement 
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getLocation() {
		return Location;
	}
	/*@XmlElement 
	public void setLocation(String location) {
		Location = location;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}*/
	@Override
	public String toString() {
		return "Student [birth_date=" + birth_date + ", DisplayName=" + DisplayName + ", Email=" + Email
				+ ", FirstName=" + FirstName + ", Gender=" + Gender + ", LastName=" + LastName + ", Location="
				+ Location + "]";
	}
}
