package jj11;

import java.util.Scanner;

public class NumberDigit extends Thread {
	
	String n,op;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		op="";
		System.out.println("Enter a Number: ");
		Scanner in=new Scanner(System.in);
		n=in.nextLine();
		String labels[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		for(int i=0;i<n.length();i++) {
			int d=Integer.parseInt(n.substring(i, i+1));
			op=op+" "+labels[d];
			
		}
		System.out.println("Output: "+op);
	}

}
