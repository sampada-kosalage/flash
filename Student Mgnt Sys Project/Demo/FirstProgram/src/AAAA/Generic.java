package AAAA;

public class Generic<T> {

	/*private T data;
	public Generic(T data) {
		this.data=data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Generic [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}*/
	
	public Generic() {
		super();
	}

	private T myVariable;

	public T getMyVariable() {
		return myVariable;
	}

	public void setMyVariable(T myVariable) {
		this.myVariable = myVariable;
	}

	@Override
	public String toString() {
		return "Generic [myVariable=" + myVariable + "]";
	}
	
	
}
