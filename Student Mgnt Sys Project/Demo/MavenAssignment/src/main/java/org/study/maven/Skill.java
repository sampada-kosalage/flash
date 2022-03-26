package org.study.maven;

@Entity
public class Skill {

    @Id
	private int id;
	private String label;
	private String description;
	
	public Skill(int id, String label, String description) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
