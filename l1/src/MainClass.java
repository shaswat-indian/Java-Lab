import java.util.Scanner;


public class MainClass {

	public static void main(String args[]) {
		
		System.out.print("Enter Number of Customers: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Account ac[]=new Account[n];
		
		for(int i=0;i<n;i++){
			System.out.println("\nCustomer "+(i+1)+":-");
			System.out.print("Enter Name: ");
			String nam=in.next();
			System.out.print("Enter Account No.: ");
			int acc=in.nextInt();
			System.out.print("Enter Phone No.: ");
			int ph=in.nextInt();
			System.out.print("Enter Balance: ");
			float ba=in.nextFloat();
			ac[i]=new Account(nam,acc,ph,ba);
			
		}
		
		ac[0].deposit();
		ac[1].withdraw();
		//ac[2].deposit();
		
		for(int i=0;i<n;i++){
			if(ac[i].balance<10000){
				ac[i].display();
			}
		}
		in.close();
	}
}
