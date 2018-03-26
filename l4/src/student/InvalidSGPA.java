package student;

public class InvalidSGPA extends Exception {
	
	float c;
	public InvalidSGPA(float sgpa) {
		// TODO Auto-generated constructor stub
		this.c=sgpa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "InvalidSGPA Exception-SGPA "+c+" cannot be more than 10!";
	}

}
