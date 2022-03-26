package Question1;

import java.sql.Date;

public class BookLeading {

	private Date creationDate;
	  private Date dueDate;
	  private Date returnDate;
	  private String bookItemBarcode;
	  private String memberId;

	  public boolean lendBook(String barcode, String memberId) {
		return false;
	}
	  public BookLending fetchLendingDetails(String barcode) {
		return null;
	}
}
