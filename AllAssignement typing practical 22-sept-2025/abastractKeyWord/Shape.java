package abastractKeyWord;

public abstract class Shape {

abstract void draw();



}
class Rectangle extends Shape{

	void draw() {
		System.out.println("drawing Rectangle");
		}
	
}
class Circle extends Shape{

	void draw() {
		System.out.println("drawing cirle");
		
	}
	
}

