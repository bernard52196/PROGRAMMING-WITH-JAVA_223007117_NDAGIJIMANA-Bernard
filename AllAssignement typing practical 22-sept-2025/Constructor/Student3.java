package Constructor;

public class Student3 {
	
int id;
String name;
public void dispaly(){
	System.out.println(id+" "+name);
	
}
public static void main ( String[] args){
	Student3 s1= new Student3();
	Student3 s2= new Student3();
	s1.dispaly();
	s2.dispaly();
	
	
}

}
