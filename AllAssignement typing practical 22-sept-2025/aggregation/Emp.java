package aggregation;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp( int id, String name, Address address){
		this.id=id;
		this. name=name;
		this.address=address;



	}
	public void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {

		Address address1=new Address("gzb","UP","India");
		Address address2=new Address("gno","UP","India");
		Emp e1=new Emp(111,"varun",address1);
		Emp e2=new Emp(222,"arun",address2);
		e1.display();
		e2.display();
		
		
		
	}

}
