// 5) Check if two numbers have same last digit

import java.util.Scanner;

class SameLastDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter 1 num : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : " );
		int num2 = sc.nextInt();
		
		if(num1 % 10 == num2 % 10)
		System.out.println("same last digit");
		else
		System.out.println("not same Digit");
	}
}