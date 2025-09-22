package aggregation;

public class BankTest2 {


	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		s.getInterestRate();
		i.getInterestRate();
		a.getInterestRate();
		
		System.out.println("SBI Rate of interest:"+s.getInterestRate());
		System.out.println("ICICI Rate of interest:"+i.getInterestRate());
		System.out.println("AXIS Rate of interest:"+a.getInterestRate());
		

	}

}
