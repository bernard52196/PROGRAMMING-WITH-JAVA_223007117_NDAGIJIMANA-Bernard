package interfaceKeyword;

public class Testinterface2 {

	
	public static void main(String[] args) {
		Bank b=new SBI();
		Bank d=new PNB();
		System.out.println("ROI:"+b.rateofinterest());
		System.out.println("ROI:"+d.rateofinterest());

	}

}
