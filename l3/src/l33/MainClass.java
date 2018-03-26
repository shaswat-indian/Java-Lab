package l33;

import l32.FourWheeler;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTwoWheeler mtw1=new MyTwoWheeler();
		mtw1.getData();
		mtw1.putData();

		MyTwoWheeler mtw2=new MyTwoWheeler(2015);
		mtw2.putData();

		
		TwoWheeler tw=new TwoWheeler();
		tw.getData();
		tw.putData();
		
		FourWheeler fw=new FourWheeler();
		fw.getData();
		fw.putData();
	}

}
