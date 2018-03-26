package student;

public class CreditLimit extends Exception {
	
	int c;
	public CreditLimit(int c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CreditLimit Exception-Registered credits "+c+" cannot be more than 30!";
	}

}
