
package l22;

public class MainClass {
	
	public static void main(String args[]) {
		
		PartyWear p1=new PartyWear(42,140,"Red",true,true,"Khadi");
		//p1.getColor();
		p1.putColor();
		p1.display();
		
		pullOver p2=new pullOver(22,350,"Yellow",true,true);
		p2.putColor();
		p2.display();
		

		FormalShirt p3=new FormalShirt(32,540,"Blue",true,true);
		p3.putColor();
		p3.display();
		
		p3.getColor();
		p3.putColor();
		
		
	}

}
