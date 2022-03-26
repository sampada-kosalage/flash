package Question1;

public class Librarian extends Account{

	public boolean addBookItem(BookItem bookItem) {
		return false;
	}
	public boolean blockMember(Member member) {
		return false;
	}
    public boolean unBlockMember(Member member) {
		return false;
	}
	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}
}
