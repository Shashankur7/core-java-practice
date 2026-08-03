// 9) Check login where: username correct password wrong

import java.util.Scanner;
class CheckUserAndPass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("enter password");
		String pass = sc.nextLine();


		String correctuser = "Shashank";
		String correctpass = "1234";


		
		if(username.equals(correctuser) && !pass.equals(correctpass))
		System.out.println("username correct pass wrong");
		else
		System.out.println("login");
	}
}
		