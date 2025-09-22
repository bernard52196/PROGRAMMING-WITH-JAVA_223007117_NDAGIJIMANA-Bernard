package aggregation;

public class TestOverloadingClass2 {

	
	public static void main(String[] args) {
		
		Adder d=new Adder();
		System.out.println(d.Add(11,11));	
		System.out.println(d.Add(12.3, 12.6));
	}

}
