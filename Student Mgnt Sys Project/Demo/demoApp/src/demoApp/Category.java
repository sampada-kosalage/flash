package demoApp;

public class Category {
	
	protected int cat_id;
	protected String grocery;
	
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getGrocery() {
		return grocery;
	}
	public void setGrocery(String grocery) {
		this.grocery = grocery;
	}
	
	public Category(int cat_id, String grocery) {
		super();
		this.cat_id = cat_id;
		this.grocery = grocery;
	}
	
	@Override
	public String toString() {
		return "Category [cat_id=" + cat_id + ", grocery=" + grocery + "]";
	}
	
	

}
