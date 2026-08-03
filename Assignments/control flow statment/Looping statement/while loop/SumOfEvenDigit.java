// write a program to print sum of even ditit

import java.util.Scanner;
class SumOfEvenDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();

		int sum = 0;
		int ld = 0;
		while (num > 0){
			ld = num % 10;
			if(ld % 2 == 0){
				sum = sum + ld;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
}