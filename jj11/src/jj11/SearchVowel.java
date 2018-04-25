package jj11;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SearchVowel extends Thread {
	
	String s;
	int c=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a String: ");
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		char vowels[]= {'a','e','i','o','u'};
		for(int i=0;i<s.length();i++) {
			char d=Character.toLowerCase(s.charAt(i));
			for(char ch:vowels) {
				if(d==ch)
					c++;
			}
		}
		System.out.println("Number of Vowels: "+c);
	}

}
