package l22;
//import l21.*;
import java.util.Scanner;

import l21.Shirt;

public class FormalShirt extends Shirt {
	
	boolean has_full_sleeve,has_stripes;
	
	public FormalShirt() {
		// TODO Auto-generated constructor stub
		has_full_sleeve=false;
		has_stripes=false;
	}
	
	FormalShirt(int s,float p,String col,boolean hh,boolean hs){
		
		super(s,p,col);
		has_full_sleeve=hh;
		has_stripes=hs;
		
	}
	@Override
	protected void putColor() {
		// TODO Auto-generated method stub
		System.out.println("Color: "+color);
		
	}

	@Override
	protected void getColor() {
		// TODO Auto-generated method stub
		System.out.println("Enter Color: ");
		Scanner in=new Scanner(System.in);
		color=in.next();
		//in.close();
	}
	
	void display() {
		
		System.out.println("\nFormal Shirt");
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Has Full Sleeves?: "+has_full_sleeve);
		System.out.println("Has Stripes?: "+has_stripes+"\n\n");

		
	}

	
}
