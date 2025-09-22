package inheritance;

public class Animal {

	public void eat(){
		System.out.println("Eating");}
}

class Dog extends Animal{

	public void back(){System.out.println("backing");}
}
class BabyDog extends Dog{
	public void weep(){
		System.out.println("weeping");
		
	}
}
class Cat extends Animal{
	public void meow(){
		System.out.println(" Meowing");
		
	}
}
