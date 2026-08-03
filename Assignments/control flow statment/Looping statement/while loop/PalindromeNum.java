// 19. Check palindrome number

import java.util.Scanner;
class PalindromeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUM :");
		int num = sc.nextInt();

		int temp = num;
		int ld = 0;
		int rev = 0;
		while(num > 0 ){
			ld = num % 10;
			rev = rev * 10 + ld;
			
			num /= 10;
		}
		if(rev == temp)
			System.out.println("Num is Palindrome");
		else
			System.out.println("not Palindrome");
	}
}