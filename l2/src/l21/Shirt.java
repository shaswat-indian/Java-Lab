package l21;

public abstract class Shirt {
	
	protected int size;
	protected double price;
	protected String color;
	
	public Shirt()
	{
		size=0;
		price=0.0;
		color="none";
	}
	
	public Shirt(int s,float p,String col)
	{
		size=s;
		price=p;
		color=col;
	}
	
	abstract protected void putColor();
	abstract protected void getColor();
	

}
