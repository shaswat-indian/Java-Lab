package jj11;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		NumberDigit nd=new NumberDigit();
		nd.start();
		Thread.sleep(5000);
		SearchVowel sw=new SearchVowel();
		sw.start();
		
	}

}
