import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Gmail implements Serializable{
	
	String name;
	transient String password;
	String email;
	transient String recoveryEmail;
	String dob;
	transient long contact;

	Gmail(String name, String password , String email, String recoveryEmail, String dob, long contact){
	
		this.name = name;
		this.password = password;
		this.email = email;
		this.recoveryEmail = recoveryEmail;
		this.dob = dob;
		this.contact = contact;
	}

	public void displayGmailInfo(){
		System.out.println("\n GMAIL INFO ");
		System.out.println("Name :" +name);
		System.out.println("Password :" +password);
		System.out.println("email :" +email);
		System.out.println("Dob:" +dob);
		System.out.println("Contact :" +contact);
	}
}
class GmailDriver{
	public static void main(String[] args){
		Gmail gmail = new Gmail("Ramesh kumar " , "ramesh@123", "ramesh@gmail.com", "ramesh@.com","01/02/2000",9876543219l);
		
		gmail.displayGmailInfo();
	
		//Serialization Process Startd

		try{
		    FileOutputStream fos = new FileOutputStream("gmail.ser");

		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(gmail);

			System.out.println("\n SERILIZATION COMPLETE \n");
		}
		catch(Exception e){
			System.out.println("Something went wrong ");
		}
	}
}
		