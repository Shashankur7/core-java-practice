//A Harshad Number (also called Niven Number) is a number that is divisible by the sum of its digits.

import java.util.Scanner;
class HarshadNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUM :");
		int num = sc.nextInt();
	
		int temp = num;
		int ld = 0;
		int sum = 0;
		while(num > 0){
			ld = num % 10;
			sum = sum + ld;
			num /= 10;
		}
			if (temp % sum == 0)
				System.out.println(temp+ "is harshad num ");
			else
				System.out.println("is not harshad");
		}
}