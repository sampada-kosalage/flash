package Question1;

import java.time.LocalDate;
import java.util.Date;

public class Member extends Account{

	private Date dateOfMembership;
	private int totalBooksCheckedout;
    public int getTotalBooksCheckedout() {
		return 0;
	}
    public boolean reserveBookItem(BookItem bookItem) {
		return false;
	}
    private void incrementTotalBooksCheckedout() {
	}

    public boolean checkoutBookItem(BookItem bookItem) {
        Object bookReservation;
		if (this.getTotalBooksCheckedout() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
          ShowError("The user has already checked-out maximum number of books");
          return false;
        } 
        else 
        	if (bookReservation != null) {
            ((BookReservation) bookReservation).updateStatus(ReservationStatus.Completed);
          }
        if (!bookItem.checkout(this.getId())) {
            return false;
          }

          this.incrementTotalBooksCheckedout();
          return true;
        }
    private String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	private void ShowError(String string) {
		// TODO Auto-generated method stub
		
	}
	private void checkForFine(String bookItemBarcode) {
        BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
        Date dueDate = bookLending.getDueDate();
        Date today = new Date();
        if (today.compareTo(dueDate) > 0) {
            long diff = todayDate.getTime() - dueDate.getTime();
            long diffDays = diff / (24 * 60 * 60 * 1000);
            Fine.collectFine(getMemberId(), diffDays);
          }
        }
    public void returnBookItem(BookItem bookItem) {
        this.checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if (bookReservation != null) 
        {
        	bookItem.updateBookItemStatus(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
          }
          bookItem.updateBookItemStatus(BookStatus.AVAILABLE);
        }
    public bool renewBookItem(BookItem bookItem) {
        this.checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
    
        if (bookReservation != null && bookReservation.getMemberId() != this.getMemberId()) {
            ShowError("This book is reserved by another member");
            member.decrementTotalBooksCheckedout();
            bookItem.updateBookItemState(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
            return false;
          } 
        else 
        	if (bookReservation != null) 
        	{
        		bookReservation.updateStatus(ReservationStatus.Completed);
            }
        BookLending.lendBook(bookItem.getBarCode(), this.getMemberId());
        bookItem.updateDueDate(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS));
        return true;
      }
	private String getMemberId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}
        	
    }
    

