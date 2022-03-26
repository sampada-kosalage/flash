package Question1;

import java.util.Date;

public class BookItem extends Book{

	private String barcode;
	  private boolean isReferenceOnly;
	  private Date borrowed;
	  private Date dueDate;
	  private double price;
	  private BookFormat format;
	  private BookStatus status;
	  private Date dateOfPurchase;
	  private Date publicationDate;
	  private Rack placedAt;

	  public boolean checkout(String memberId) {
	    if(BookItem.getIsReferenceOnly()) {
	      ShowError("This book is Reference only and can't be issued");
	      return false;
	    }
	    if(!BookLending.lendBook(this.getBarCode(), memberId)){
	        return false;
	      }
	      this.updateBookItemStatus(BookStatus.Loaned);
	      return true;
	    }

	void updateBookItemStatus(BookStatus loaned) {
		// TODO Auto-generated method stub
		
	}

	Object getBarCode() {
		// TODO Auto-generated method stub
		return null;
	}

	private void ShowError(String string) {
		// TODO Auto-generated method stub
		
	}

	private static boolean getIsReferenceOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	  }

