class Batch{
	String subjectName;
	String timings;
	String code;
	String trainerName;
	int countStudents;
	
	Batch(String subjectName, String timings, String trainerName, int countStudents, String code)
	{
		super();
		this.subjectName = subjectName;
		this.timings = timings;
		this.trainerName = trainerName;
		this.countStudents = countStudents;
		this.code = code;
	}
	void displayBatch(){
		System.out.println("\n Batch INfo");
		System.out.println("subject Name :" +subjectName);
		System.out.println("code :" +code);
		System.out.println("Timing :" +timings);
		System.out.println("Trainer Name:" +trainerName);
		System.out.println("count students :" +countStudents);
	}
}
class Student{
	String name;
	String email;
	long contact;
	Batch batch;
	
	Student(String name, String email, long contact, Batch batch){
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.batch = batch;
	}

	// copy constructor
	Student(Student old){
		this.name = old.name;
		this.email = old.email;
		this.contact = old.contact;
		this.batch = old.batch;
	}
	void displayStudent(){
		System.out.println("\nStudent Info");
		System.out.println("name :" +name);
		System.out.println("Email :" +email);
		System.out.println("Contact :" +contact);		
		batch.displayBatch();
	}
}
class DriverExampleShalloCopy{
	public static void main(String[] args){
		Batch batch = new Batch("coreJava","8.30","shrikant",80,"A40");
		Student old = new Student("Vipul","vipul@gmail.com",7675768374387l,batch);
		old.displayStudent();
	
		System.out.println("__________________________________________");
		Student copy = new Student(old);
		copy.displayStudent();
		System.out.println("_________________Changes name of copy obj ______________________");
		copy.name = "Alkesh";
		copy.email= "alkes@gmail.com";
		System.out.println("____________copy_________");
		copy.displayStudent();
		System.out.println("__________odl________");
		old.displayStudent();

		System.out.println("_____________old changes trainer ___________");
		old.batch.trainerName = "Pavan sir";
		old.displayStudent();
		System.out.println("copy afte changes in cested obj by ols");
		copy.displayStudent();
	}
}





































		