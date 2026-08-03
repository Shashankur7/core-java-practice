// 15. Factorial of a number

import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nem :");
		int num = sc.nextInt();
		

		int fact = 1;
		for ( ; num >= 1; num--)
			fact = fact*num;
		
		System.out.println("Factorial res : " +fact);
	}
}
