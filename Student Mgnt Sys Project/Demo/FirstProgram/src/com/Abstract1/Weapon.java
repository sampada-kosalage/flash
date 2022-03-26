package com.Abstract1;

public abstract class Weapon {
    String Name;
	double baseDamage;
	double baseDurability;
	int value;
	double weight;
	
	public Weapon(String name, double baseDamage, double baseDurability, int value, double weight) {
		super();
		Name = name;
		this.baseDamage = baseDamage;
		this.baseDurability = baseDurability;
		this.value = value;
		this.weight = weight;
	}
	
	public void polish() {
		
	}
	public abstract String use();
	{
		
	}
	@Override
	public String toString() {
		return "Weapon [Name=" + Name + ", baseDamage=" + baseDamage + ", baseDurability=" + baseDurability + ", value="
				+ value + ", weight=" + weight + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(double baseDamage) {
		this.baseDamage = baseDamage;
	}

	public double getBaseDurability() {
		return baseDurability;
	}

	public void setBaseDurability(double baseDurability) {
		this.baseDurability = baseDurability;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
