package staticValiable;

public class TestStaticValiable {

	
	public static void main(String[] args) {
		Student s1= new Student(111,"karan");
		Student s2= new Student ( 222, "Aryan");
		Student.college="UR";
		s1.display();
		s2.display();

	}

}
