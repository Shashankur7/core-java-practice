import java.util.Scanner;

class NumberRange{
	public static void main(String [] args){
		Scanner srn = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = srn.nextInt();

		String res = (num >= 10 && num <= 50 ) ? "In Range " : " Out of range ";
		System.out.println(res);
	}
} 