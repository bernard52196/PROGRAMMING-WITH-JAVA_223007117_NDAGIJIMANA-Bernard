package aggregation;


public class Bank{
	int getInterestRate(){
	return 0;
	}
}
class SBI extends Bank{
	int getInterestRate(){
		return 8;
		
	}
}
class ICICI extends Bank{
	int getInterestRate(){return 7;}
}
class AXIS extends Bank{
	int getInterestRate(){return 9;}
}