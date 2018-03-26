package l33;
import l31.*;


import java.util.Scanner;

public class TwoWheeler extends Vehicle {
	
	public TwoWheeler() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public TwoWheeler(int n) {
		// TODO Auto-generated constructor stub
		super(n);
	}

	@Override
	protected void getData() {
		// TODO Auto-generated method stub
		System.out.println("Enter Year of Manufacture: ");
		Scanner in =new Scanner(System.in);
		yearOfMan=in.nextInt();
		//in.close();

	}

	@Override
	protected void putData() {
		// TODO Auto-generated method stub
		System.out.println("Year of Manufacture: "+yearOfMan+"\n");

	}

}
