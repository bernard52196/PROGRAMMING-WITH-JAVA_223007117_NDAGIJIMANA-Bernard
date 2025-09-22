package thisKeyWord;

public class Student {

	int rollno;
	String name;
	float fee;

	public Student(int rollno,String name,float fee){
		rollno=rollno;
		name=name;
		fee=fee;}

	public void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}


}
