import java.util.Scanner;

class Factorial
{
	public static void main(String [] args)
	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num = scn.nextInt();

		int fact = 1;
		for ( ; num >= 1; num--)
			fact = fact * num;
		System.out.println("Factorial  ras : " +fact);
	}
}