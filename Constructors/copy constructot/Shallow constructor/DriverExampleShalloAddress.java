class Address{
	String area;
	String city;
	String state;
	int pinCode;

	Address(String area, String city , String state , int pinCode) 
	 	{
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		}
		void displayAddress(){
		System.out.println("\n Address info");		
		System.out.println("Area :" +area);
		System.out.println("city :" +city);
		System.out.println("state :" +state);
		System.out.println("pincode :" +pinCode);
	}
}
class Student{
	String name;
	String email;
	String yop;
	Address add;

	Student(String name, String email, String yop, Address add)
		{
		super();
		this.name = name;
		this.email = email;
		this.yop = yop;
		this.add = add;
	}
	void displayStudent(){
	
		System.out.println("\n Student info");
		System.out.println("Name :" +name);
		System.out.println("email :" +email);
		System.out.println("yop :" +yop);
		System.out.println("add :" +add);		

	}
 
// copy constructor

Student(Student old){
	this.name = old.name;
	this.email = old.email;
	this.yop = old.yop;
	this.add = old.add;
	}
	void displayStuden(){
	
		System.out.println("\n Student info");
		System.out.println("Name :" +name);
		System.out.println("email :" +email);
		System.out.println("yop :" +yop);
		System.out.println("add :" +add);
		add.displayAddress();
	}
}
class DriverExampleShalloAddress{
	public static void main(String[] args){
		Address add = new Address("Deccan","pune","MH",123);
		
		Student old = new Student("Ramesh", "rames@gmail.com","2026",add);

		//copy
		Student copy = new Student(old);
		copy.displayStudent();
	}
}
		
	




















