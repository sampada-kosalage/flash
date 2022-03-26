package AAAA;

public class Pair<F,S> {

	public Pair() {
		super();
	}
	
	private F Variable;

	public F getVariable() {
		return Variable;
	}

	public void setVariable(F variable) {
		Variable = variable;
	}

	@Override
	public String toString() {
		return "Pair [Variable1=" + Variable1 + "]";
	}
	private S Variable1;

	public S getVariable1() {
		return Variable1;
	}

	public void setVariable1(S variable1) {
		Variable1 = variable1;
	}


	
	

}
