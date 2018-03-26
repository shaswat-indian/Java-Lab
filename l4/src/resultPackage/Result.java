package resultPackage;

import student.CreditLimit;
import student.InvalidSGPA;
import studentPackage.RegisterStudent;

public class Result {

	RegisterStudent rs;
	float sgpa[]=new float [4];
	float cgpa;
	
	public Result(RegisterStudent rs) {
		// TODO Auto-generated constructor stub
		this.rs=rs;
	}
	
	public float[] getSGPA() throws NumberFormatException, InvalidSGPA {
		int totalgp=0,totalcred=0;
		for(int i=0;i<4;i++) {
			System.out.println("\nSemester "+(i+1)+":-");
			int total=0,cred=0;
			for(int j=0;j<4;j++) {
				if(rs.marks[i][j]>=90) {
					total+=(10*rs.credits[i][j]);
					cred+=rs.credits[i][j];
					System.out.println("Subject "+(j+1)+" : S");
				}
				else if(rs.marks[i][j]>=75) {
					total+=(9*rs.credits[i][j]);
					cred+=rs.credits[i][j];
					System.out.println("Subject "+(j+1)+" : A");
				}
				else if(rs.marks[i][j]>=60) {
					total+=(8*rs.credits[i][j]);
					cred+=rs.credits[i][j];
					System.out.println("Subject "+(j+1)+" : B");
				}
				else if(rs.marks[i][j]>=50) {
					total+=(7*rs.credits[i][j]);
					cred+=rs.credits[i][j];
					System.out.println("Subject "+(j+1)+" : C");
				}
				else if(rs.marks[i][j]>=40) {
					total+=(6*rs.credits[i][j]);
					cred+=rs.credits[i][j];
					System.out.println("Subject "+(j+1)+" : D");
				}
				else {
					System.out.println("Subject "+(j+1)+" : F");

				}
				
				
			}
			if(cred!=0) {
				
				sgpa[i]=(float)total/cred;
				if(sgpa[i]>10)
					throw new InvalidSGPA(sgpa[i]);
				totalcred+=cred;
				totalgp+=total;
				System.out.printf("SGPA = %.2f \n",sgpa[i]);
			}
			else {
				sgpa[i]=0;
				System.out.printf("SGPA = %.2f \n",sgpa[i]);
			}
				
			
		
		}
		cgpa=(float)totalgp/totalcred;
		System.out.printf("\nCGPA = %.2f \n",cgpa);
	
		return sgpa;
	}
	
	public float getCGPA() {
		return cgpa;
	}
	

}
