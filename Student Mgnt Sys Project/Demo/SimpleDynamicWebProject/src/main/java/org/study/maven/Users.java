package org.study.maven;

import jakarta.validation.constraints.Size;

public class Users {
	@Size(min=5,max=10)
	private String name;
	private String gender,country,introduction,visitedCountries;
	
	public String grtName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction=introduction;
	}
	public String getVisitedCountries() {
		return getVisitedCountries();
	}
	public void setVisitedCountries(String visitedcountries) {
		this.visitedCountries=visitedcountries;
	}
	
	
	@Override
	public String toString() {
		return "User(name="+name+",gender="+gender+",country="+country+",introduction="+introduction+",visitedcountries="+visitedCountries+")";
	}
}


