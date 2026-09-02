class Student222
{
	String name;
	long contact;
	
	static String batchCode = "A38";
	
	void Student(String name, long contact){
		this.name = name;
		this.contact = contact;
	}
	void displayStudent(){
		System.out.println(batchCode);
		System.out.println(name);
		System.out.println(contact);
	}
}
class StudentDrivers2
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("Ramesh",123);
			s1.displayStudent();
			
		Student s2 = new Student("suresh", 456);
		s2.displayStudent();
	}
}
