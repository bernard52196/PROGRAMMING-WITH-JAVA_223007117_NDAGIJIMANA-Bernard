package interfaceKeyword;

interface Bank {
 float rateofinterest();


}

class SBI implements Bank{

	public float rateofinterest() {return 9.15f ;}
	
}
class PNB implements Bank{
	public float rateofinterest(){return 9.7f;}
}

