package First;

public class Studet {
	int rollno;
	String name;
	public void insertRecord( int r,String n){
		rollno=r;
		name=n;
		
	}
	public void displayInformation(){
		System.out.println(rollno+" "+name);
	}
}
