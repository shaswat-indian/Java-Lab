package l32;
import l31.*;


import java.util.Scanner;

public final class FourWheeler extends Vehicle {

	public FourWheeler() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public FourWheeler(int n) {
		// TODO Auto-generated constructor stub
		super(n);
	}
	
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Year of Manufacture: ");
		Scanner in =new Scanner(System.in);
		yearOfMan=in.nextInt();
		//in.close();
	}

	@Override
	public void putData() {
		// TODO Auto-generated method stub
		System.out.println("Year of Manufacture: "+yearOfMan+"\n");

	}

}
