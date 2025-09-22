package thisKeyWord;

public class StudentCorrect {

	int rollno;
	String name;
	float fee;

	public StudentCorrect(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;}

	public void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}

}
