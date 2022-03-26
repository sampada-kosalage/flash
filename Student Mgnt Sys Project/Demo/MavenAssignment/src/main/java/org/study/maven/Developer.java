package org.study.maven;

import java.util.List;

@Entity
public class Developer {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	@ManyToMany
	private List<Skill>skill;
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(int id, String firstName, String lastName, String email, List<Skill> skill) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.skill = skill;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	public boolean hasSkill(Skill skill) {
		for(Skill containedSkill:getSkill()) {
			if(containedSkill.getId()==skill.getId()) {
				return true;
				
			}
		}
		return false;
	}
	
}
