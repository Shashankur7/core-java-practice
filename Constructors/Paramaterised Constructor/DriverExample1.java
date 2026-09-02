class Google{
	String username;
	String email;
	long contact;
	String password;
	
	Google(){
		super();
	}

	Google(String username, String email, String password, long contact){
		super();
		this.username = username;
		this.email = email;
		this.contact = contact;
		this.password = password;
	
	}
	public void displayGoogle(){
		System.out.println("Google Info");
		System.out.println("username :" +username);
		System.out.println("Email :" +email);
		System.out.println("contact :" +contact);
		System.out.println("passwod :" +password);
	}
}
class GoogleClassRoom extends Google{
	String classRoomName;
	String subject;
	String teacher;
	String code;

	GoogleClassRoom(String username, String email, String password, long contact, 
			String classRoomName, String subject, String teacher, String code)
	{
		super(username, email, password, contact);
		this.classRoomName = classRoomName;
		this.subject = subject;
		this.teacher = teacher;
		this.code = code;
	}
	public void displayClassRoom(){
		displayGoogle();
		System.out.println("Class room Info");
		System.out.println("name :" +classRoomName);
		System.out.println("Subject :" +subject);
		System.out.println("Teacher:" +teacher);
		System.out.println("code :" +code);
	}
}
class DriverExample1{
	public static void main(String[] args){
		GoogleClassRoom obj = new GoogleClassRoom
		("Rames kumar", "rames@gmail.com","Ramesh123",987627348l,"m6",
		"core Java","shrikant","jalsjf$##%");
		obj.displayClassRoom();
	}
}		



























