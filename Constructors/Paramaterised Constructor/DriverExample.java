import java.util.ArrayList;
class Student
{
	String sname;
	String sid;
	String address;
	double fees;
	String standard;

	Student(String sname, String sid, String address, double fees,  String standard ){
		super();
		this.sname = sname;
		this.sid = sid;
		this.address = address;
		this.fees = fees;
		this.standard = standard;
	}
	void displayStudent()
		{
			System.out.println("\n Student Info");
			System.out.println("Sname : " +sname);
			System.out.println("sid : " +sid);
			System.out.println("address : " +address);
			System.out.println("fees : " +fees);
			System.out.println("class : " +standard);
		}
}
class School
{
	String name;
	String principal;
	String address;
	String email;
	ArrayList<Student> stuList = new ArrayList<Student>();
	
	School(String name1, String principal, String address, String email)
	{
		super();	
		name = name1;
		this.principal = principal;
		this.address = address;
		this.email = email;
	}
	public void displaySchool()
	{
		System.out.println("\n School Info");
		System.out.println("Name :" +name);
		System.out.println("Principal :" +principal);
		System.out.println("address :" +address);
		System.out.println("email :" +email);
	
		displayAllStudents();
	}
	public void addStudent(Student stu){
		stuList.add(stu);
	}
	public void displayAllStudent(){
		System.out.println("\n All Student List\n");
		for(Student ele : stuList){
			ele.displayStudent();
		}
	}
}
class DriverExample{
	public static void main(String[] args){
		School school = new School("Aips","Naga Raju","Nagpur","Aips@gmai.com");
		student.displayStudent();
		student.addStudent(new Student("Piyush","1","Dahegaon",50000,"10"));
		student.addStudent(new Student("Sudhir","2","Parshivni",50000,"9"));
		student.addStudent(new Student("Roshan","3","Saoner",50000,"11"));
	
		student.displaySchool();
	}
}
		









































	