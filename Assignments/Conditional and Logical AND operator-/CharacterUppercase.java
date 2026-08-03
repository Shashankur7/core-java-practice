import java.util.Scanner;
class CharacterUppercase{
	
	
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Character : ");

	char ch = sc.next().charAt(0);
	String res = (ch >= 'A' && ch <='Z') ? "Uppercase" : "Not Uppercase" ;
	System.out.println(res);
	}
}