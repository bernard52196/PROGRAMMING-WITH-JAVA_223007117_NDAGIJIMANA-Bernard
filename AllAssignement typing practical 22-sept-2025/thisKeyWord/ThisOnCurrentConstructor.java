package thisKeyWord;

public class ThisOnCurrentConstructor {

public ThisOnCurrentConstructor(){
		System.out.println("hello");}
public ThisOnCurrentConstructor (int x){
			this();
			System.out.println(x);
			
		
		
	} 

}
