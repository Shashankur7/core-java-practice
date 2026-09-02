class Employee{
	//
	String name;
	String empId;
	String department;
	String company;
	double salary;
	long contact;

	void displayEmployee(){
		System.out.println("\n Employ Info ");
		System.out.println("Company" +company);
		System.out.println("emp Id" +empId);
		System.out.println("Name" +name);
		System.out.println("Department" +department);
		System.out.println("Salary" +salary);
		System.out.println("Contact" +contact);

	}
}
class DriverExample{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.name = "Ramesh kumar";
		emp1.company = "Amazon";
		emp1.empId = "AMA" +123;
		emp1.department = "Sales";
		emp1.salary = 50000;
		emp1.contact = 98765443210l;
		emp1.displayEmployee();
		System.out.println("_______________________________");

		Employee emp2 = new Employee();
		emp2.name = "Suresh kumar";
		emp2.company = "Flipkart";
		emp2.empId = "AMA" +123;
		emp2.department = "Hr";
		emp2.salary = 60000;
		emp2.contact = 98765443210l;
		emp2.displayEmployee();
		System.out.println("_______________________________");

	}
}