// 18. Reverse number

import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int num = sc.nextInt();

		int rev = 0;
		int lastDigit = 0;

		for (  ; num > 0 ; num = num/10){
			lastDigit = num % 10;
			rev = rev*10 + lastDigit;
		}
		System.out.println(num);
		System.out.println(lastDigit);
		
		System.out.println(rev);
	}
}