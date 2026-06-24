// 15. Factorial of a number

import java.util.Scanner;
class FactorialOfNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter num :");
		int num = sc.nextInt();
		
		int i = 1;
		int fact = 1;
		while(num > 0){
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	}
}