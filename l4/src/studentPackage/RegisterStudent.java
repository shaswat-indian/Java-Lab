package studentPackage;

import java.util.Scanner;

import student.CreditLimit;
import student.Student;

public class RegisterStudent implements Student {

	String name,branch;
	public int credits[][]=new int[4][4];
	public int marks[][]=new int [4][4];
	float sgpa[]=new float [4];
	float cgpa;
	
	
	public RegisterStudent() throws CreditLimit {
		// TODO Auto-generated constructor stub
		name="";
		branch="";
		this.getDetails(name,branch);
		this.getCredits();
		this.getMarks();
	}
	
	public RegisterStudent(String name,String branch) throws CreditLimit {
		// TODO Auto-generated constructor stub
		this.getDetails(name,branch);
		this.getCredits();
		this.getMarks();
		
	}
	
	@Override
	public void getDetails(String name, String branch) {
		// TODO Auto-generated method stub
		this.name=name;
		this.branch=branch;
		
	}
	
	void getMarks() {
		for(int i=0;i<4;i++) {
			System.out.println("\nEnter Marks in Semester "+(i+1)+":-");
			for(int j=0;j<4;j++) {
				System.out.print("Enter Marks in Subject "+(j+1)+": ");
				Scanner in=new Scanner(System.in);
				marks[i][j]=in.nextInt();
				
			}
		}
	}
	
	void getCredits() throws CreditLimit{
		
		for(int i=0;i<4;i++) {
			int total=0;
			System.out.println("\nEnter Credits in Semester "+(i+1)+":-");
			for(int j=0;j<4;j++) {
				System.out.print("Enter Credits in Subject "+(j+1)+": ");
				Scanner in=new Scanner(System.in);
				credits[i][j]=in.nextInt();
				total+=credits[i][j];
			}
			if(total>30)
				throw new CreditLimit(total);
			
		}
	}
	
	public void setSGPA(float s[]) {
		for(int i=0;i<4;i++) {
			sgpa[i]=s[i];
		}
		
	}
	
	public void setCGPA(float c) {
		cgpa=c;
	}
	
	public void displayResult() {
		System.out.println("\n\nName: "+name);
		System.out.println("Branch: "+branch);
		for(int i=0;i<4;i++) {
			System.out.printf("SGPA in Semester %d : %.2f \n",(i+1),sgpa[i]);
		}
		System.out.printf("CGPA: %.2f \n",cgpa);
		
	}
	
}

