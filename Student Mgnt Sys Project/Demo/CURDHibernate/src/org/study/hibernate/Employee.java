package org.study.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee {
    
   
   @Column(name="Name")
	String name;
	
	@Column(name="Password")
	String password;
	
	@Column(name="Email")
	String email;
	
	@Column(name="Country")
	String country;
	
	public Employee() {
		super();
	}

	public Employee(String name, String password, String email, String country) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", email=" + email + ", country=" + country + "]";
	}

}