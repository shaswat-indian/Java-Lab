package student;


import resultPackage.Result;
import studentPackage.RegisterStudent;

public class MainClass {

	public static void main(String[] args) throws CreditLimit,NumberFormatException, InvalidSGPA {
		// TODO Auto-generated method stub

		RegisterStudent rs1=new RegisterStudent("Modi", "ISE");
		//rs1.getDetails("Modi", "ISE");
		Result r1=new Result(rs1);
		rs1.setSGPA(r1.getSGPA());
		rs1.setCGPA(r1.getCGPA());
		rs1.displayResult();
		
	}

}
