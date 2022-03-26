package com.Abstract1;

public abstract class Consumable {
    
	boolean consumed;
	boolean spoiled;
	String eat;
	
	public Consumable(boolean consumed, boolean spoiled) {
		super();
		this.consumed = consumed;
		this.spoiled = spoiled;
	}
	public void use() {
		
	}
	public boolean isconsumed() {
		return consumed;
		
	}
	public void setConsumed(boolean consumed) {
		this.consumed=consumed;
	}

	@Override
	public String toString() {
		return "Consumable [consumed=" + consumed + ", spoiled=" + spoiled + ", eat=" + eat + "]";
	}
	
	
	
	
}
