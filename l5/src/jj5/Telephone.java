package jj5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Telephone {

	HashMap<Integer,String> ac;
	//ArrayList<Integer> mc=new ArrayList<Integer>(10);
	ArrayList<MissedCall> mc=new ArrayList<MissedCall>(10);
	
	public Telephone() {
		// TODO Auto-generated constructor stub
		ac=new HashMap<Integer,String>(10);		
	}
	
	void getData(int number,String name) {
		ac.put(number, name);	
	}
	
	void getMissedCall(MissedCall mcn) {
		if(mc.size()<10)
			mc.add(mcn);
	/*
		else {
			for(int i=0;i<9;i++)
				mc.set(i, mc.get(i+1));
			mc.remove(9);
			mc.add(9, mcn);
		}
	*/
		else {
			mc.remove(0);
			mc.add(mcn);
		}
	
	}
	
	void showAllMissedCalls() {
		//System.out.println(mc);
		System.out.println("List of All Missed Calls:-");
		//Set<Entry<Integer, String>> set=ac.entrySet();
		ListIterator<MissedCall> li=mc.listIterator();
		while(li.hasNext()) {
			MissedCall m=li.next();
			System.out.println("\n\nMissed Call from Number: "+m.number);
			System.out.println("**MENU**\n1.Delete this call.\n2.Next Missed Call\n3.Display Details");
			System.out.print("Enter Your Choice: ");
			Scanner in=new Scanner(System.in);
			int ch=in.nextInt();
			switch(ch) {
				case 1:
					//delthisCall(m.number);
					li.remove();
					System.out.println("This Call Record was Deleted!");
					break;
		
				case 2:
					continue;
				case 3:
					showThisCall(m);
					break;
				default:
					System.out.println("Invalid Choice! Displaying Next Missed Call..");
							
			}
			
		/*
			if(ac.get(m.number)!=null)
				System.out.println("\nName: "+ac.get(m.number)+m);
			else
				System.out.println("\nName: "+"Private Caller"+m);
		*/
		}
			
	}
	
	/*
	void delthisCall(int n) {
		ListIterator<MissedCall> li=mc.listIterator();
		int i;
		while(li.hasNext()) {
			MissedCall thisCall=li.next();
			if(thisCall.number==n) {
				mc.remove(thisCall);
				break;
			}
		}		
	}
	*/
	
	void showThisCall(MissedCall m) {
		if(ac.get(m.number)!=null)
			System.out.println("\nName: "+ac.get(m.number)+m);
		else
			System.out.println("\nName: "+"Private Caller"+m);
	}
	
	void showAllMissedCallsDetails() {
		ListIterator<MissedCall> lm=mc.listIterator();
		while (lm.hasNext()) {
			 showThisCall(lm.next());
			
		}
	}
	
	/*
	void tryDisplay() {
		ListIterator<MissedCall> l=mc.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next().number);
		}
	}
	*/
	
	

}
