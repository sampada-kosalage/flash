
public abstract class FountainPen extends Pen{

	
	@Override
	public void write()
	{
		System.out.println("write text");
	}

	public void refill() {
		System.out.println("refill pen");

	}
	public void changeNib()
	{
		System.out.println("change the nib");

	}
	
}
