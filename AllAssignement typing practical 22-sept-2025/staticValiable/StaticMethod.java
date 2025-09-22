package staticValiable;

public class StaticMethod {

int rollno;
String name;
static String college="ITS";
 public static void change(){
	 college="BBDIT";
	 
 }
 public StaticMethod(int r, String n){
	 rollno=r;
	 name=n;
	 
 }
 
 public void display(){
	 System.out.println(rollno+" "+name+" "+college);
		 
	 
 }
	

}
