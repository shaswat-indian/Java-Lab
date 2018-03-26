package l31;

public abstract class Vehicle {
	
	protected int yearOfMan;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		yearOfMan=0;
	}
	
	public Vehicle(int yom){
		
		yearOfMan=yom;
		
	}
	
	protected abstract void getData();
	protected abstract void putData();
	
}
