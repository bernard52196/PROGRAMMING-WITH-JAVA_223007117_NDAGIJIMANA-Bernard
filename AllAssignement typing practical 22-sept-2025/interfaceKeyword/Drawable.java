


package interfaceKeyword;

interface Drawable {

	void draw();


}
class Rectangle implements Drawable{

	public void draw() {
		System.out.println("Draw Rectangle");


	}


}
class Circle implements Drawable{
	public void draw(){
		System.out.println("Draw circle");
	}
	
}