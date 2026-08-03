// 12) Check if number is divisible by lastdigit or not

import java.util.Scanner;

class DivisibleByLastDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		int ld = num % 10;
		if (num != 0 && num % ld ==0)
			System.out.println(num+ "Divisible by last digit");
		else
			System.out.println("not divisible");
	}
}