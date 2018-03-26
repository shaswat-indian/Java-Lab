package l22;

public class PartyWear extends FormalShirt {
	
	String brand;
	
	PartyWear(){
		
		brand="none";		
	}
	
	PartyWear(int s,float p,String col,boolean hh,boolean hs,String b){
		
		super(s,p,col,hh,hs);
		brand=b;
		
	}
	
	void display() {
		
		System.out.println("\nParty Wear");
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Has Full Sleeves?: "+has_full_sleeve);
		System.out.println("Has Stripes?: "+has_stripes);
		System.out.println("Brand: "+brand+"\n\n");
		
	}

	

}
