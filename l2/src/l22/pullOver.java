package l22;

import java.util.Scanner;

import l21.Shirt;

final public class pullOver extends Shirt {
	
	boolean has_hood,has_stripes;
	
	public pullOver() {
		// TODO Auto-generated constructor stub
		has_hood=false;
		has_stripes=false;
	}
	
	pullOver(int s,float p,String col,boolean hh,boolean hs){
		
		super(s,p,col);
		has_hood=hh;
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
		
		System.out.println("\nPull Over");
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Has Hood?: "+has_hood);
		System.out.println("Has Stripes?: "+has_stripes+"\n\n");
		
		
	}
	
	

}
