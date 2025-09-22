package staticValiable;

public class Student {

	int rollno;
	String name;
	static String college="INES";
		
	public Student(int r, String n){
		rollno=r;
		name=n;
		
	}
	public void display(){
		System.out.println(rollno+" "+name+" "+college);
		
	}
	

}
