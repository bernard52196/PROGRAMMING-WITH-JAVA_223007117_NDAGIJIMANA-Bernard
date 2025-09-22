package abastractKeyWord;

abstract class Bike {
abstract void run();


}
class Honda4 extends Bike{

	void run() {System.out.println("running safely");
		
		
	}
	public static void main (String[]args){
		Bike b=new Honda4();
		b.run();
	}
	
}
