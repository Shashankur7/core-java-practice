// 21) Check if char is octal digit

import java.util.Scanner;
class OctalDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		char ch = sc.next().charAt(0);

		if (ch >= '0' && ch <= '7')
		System.out.println("octal digit");
		else 
		System.out.println("not octal digit");
	}
}