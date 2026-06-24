import java.util.Scanner;

class NegativeOddNumber{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num :");
		int num = sc.nextInt();
		String res = (num < 0 && num % 2 == -1) ? "Negative  Odd " : " not Negative Odd";
		System.out.println(res);
		
	}
}