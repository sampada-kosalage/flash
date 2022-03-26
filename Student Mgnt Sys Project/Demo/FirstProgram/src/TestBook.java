
public class TestBook {

	
	public static void main(String[] args) {

 Author author=new Author("Sam","sam@gmail.com",'F');
 Book book= new Book("AAA",author,200,2);
 System.out.println(book.toString());
 System.out.println(book.getAuthor().getName());
 System.out.println(book.getAuthor().getEmail());

	}

}
