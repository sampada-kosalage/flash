package org.study.beans;

public class User {

	public User(int i, String string, String string2) {
		FirstName="Samada";
		LastName="Kosalage";
	}
	String FirstName;
	String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastNAme() {
		return LastName;
	}
	public void setLastNAme(String lastNAme) {
		LastName = lastNAme;
	}
}
