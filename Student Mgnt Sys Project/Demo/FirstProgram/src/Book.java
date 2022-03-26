
public class Book {

	public Book(String model) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, Author author, int qty,int i) {
		super();
		this.name = name;
		//this.author=author;
		this.price = price;
		this.qty = qty;
	
	//public Book(String name, double price, int qty) {
		this.name = "Robotech";
		this.price = 800;
		this.qty = 4;
	}
	
	private String name;
	private double price;
	private int qty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	public boolean getAuthor() {
		// TODO Auto-generated method stub
		return false;
	}
}





