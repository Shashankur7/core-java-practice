// 19. Check palindrome number

import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	

		int temp = num;
		int rev = 0;
		int ld = 0;
		do {
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}while(num > 0);
		if(temp == rev){
			System.out.println("palindreom");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}