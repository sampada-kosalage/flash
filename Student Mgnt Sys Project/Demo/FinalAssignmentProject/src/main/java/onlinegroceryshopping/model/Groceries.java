package onlinegroceryshopping.model;

public class Groceries {
	
	protected String product_name ;
	protected String prod_img;
	protected String product_desc;
	protected double product_price;
	protected int cat_id;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	
	public Groceries(String product_name, String prod_img, String product_desc, double product_price, int cat_id) {
		super();
		this.product_name = product_name;
		this.prod_img = prod_img;
		this.product_desc = product_desc;
		this.product_price = product_price;
		this.cat_id = cat_id;
	}
	
	@Override
	public String toString() {
		return "Groceries [product_name=" + product_name + ", prod_img=" + prod_img + ", product_desc=" + product_desc
				+ ", product_price=" + product_price + ", cat_id=" + cat_id + "]";
	}
	}
