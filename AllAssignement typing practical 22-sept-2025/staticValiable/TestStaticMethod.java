package staticValiable;

public class TestStaticMethod {

	public static void main(String[] args) {
		StaticMethod s1= new StaticMethod(111,"Allena");
		StaticMethod s2= new StaticMethod(222,"Aryana");
		StaticMethod s3= new StaticMethod(333,"Anancy");
		StaticMethod.change();
		s1.display();
		s2.display();
		s3.display();
		
	

	}

}
