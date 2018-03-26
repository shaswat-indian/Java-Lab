package jj5;

import java.util.Scanner;

public class MainClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone t=new Telephone();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Contact Details for 10 People:-");
		for(int i=0;i<10;i++) {
			System.out.println("\nPerson "+(i+1)+":-");
			System.out.print("Enter Name: ");
			String name=in.nextLine();
			System.out.print("Enter Number: ");
			int num=Integer.parseInt(in.nextLine());
			t.getData(num, name);
			
		}
		
		
		//t.getData(12345,"abc");
		//t.getData(67891, "def");
		t.getMissedCall(new MissedCall(12.5,778985));
		t.getMissedCall(new MissedCall(14.30,12345));
		t.getMissedCall(new MissedCall(15.30,67891));
		//t.getMissedCall(new MissedCall(15.35,98765));
		//t.getMissedCall(new MissedCall(16.30,67891));
		
		

		
		
		//t.tryDisplay();
		t.showAllMissedCalls();
		//t.delthisCall(12345);
		//t.showAllMissedCallsDetails();

	}

}
