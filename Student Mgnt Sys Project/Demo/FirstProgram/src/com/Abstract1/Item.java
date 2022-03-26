package com.Abstract1;

public abstract class Item implements Comparable{
    int id;
	int value;
	String Name;
	double weight;
			
	public Item(int id, int value, String name, double weight) {
		super();
		this.id = id;
		this.value = 3000;
		this.Name = "ring";
		this.weight = 0.013;
	}
    @Override
	public String toString() {
		return "Item [id=" + id + ", value=" + value + ", Name=" + Name + ", weight=" + weight + "]";
	}
    
    public String toString1() {
		return "Item[value= + 3000 + Name="+ toString()+",weight="+0.013+"]";
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    public int getValue() {
		return value;
	}
    public void setValue(int value) {
		this.value = value;
	}
    public String getName() {
		return Name;
	}
    public void setName(String name) {
		Name = name;
	}
    public double getWeight() {
		return weight;
	}
    public void setWeight(double weight) {
		this.weight = weight;
	}
    
    public void CompareTo() {
    	if(id>=1) {
    		System.out.println("It will print the positive");
    	}
    	else
    	{
    		System.out.println("It will print negative");
    	}
    }
   
}
