import java.util.Scanner;


public class Account {
	
	String name;
	int accNo,phNo;
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
		name="";
		accNo=0;
		phNo=0;
		balance=0;
	}
	
	Account(String n, int a,int p,float bal){

		name=n;
		accNo=a;
		phNo=p;
		balance=bal;
	}
	
	void deposit(){
		
		System.out.println("Enter Amount to be Deposited:");
		Scanner in = new Scanner(System.in);
		float dep=in.nextFloat();
		//in.close();
		balance+=dep;
		System.out.print("Amount Deposited Successfully!");
		}
	
	void withdraw(){
		
		System.out.print("Enter Amount to be Withdrawn:");
		Scanner in = new Scanner(System.in);
		float dep=in.nextFloat();
		//in.close();
		if(dep<=balance && dep>=0){
			balance-=dep;
			System.out.println("Amount Withdrawn Successfully!");
		}
		else
			System.out.println("Amount greater than Balance!");
	
	}
	
	void display(){
		
		System.out.println("Name: "+name);
		System.out.println("Account No.: "+accNo);
		System.out.println("Phone No.: "+phNo);
		System.out.printf("Balance: %.2f",balance);
		
	}
	

}


