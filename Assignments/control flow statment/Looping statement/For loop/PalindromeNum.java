// 19. Check palindrome number

import java.util.Scanner;
class PalindromeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int ld = 0;
		int rev = 0;
		int temp = num;
		for ( ; num > 0 ; num= num/10){
			ld=num%10;
			rev = rev * 10 + ld;
		}
		if(rev == temp)
		System.out.println(temp+ "is palindrome");
		else
		System.out.println("not palindrome");
	}
}