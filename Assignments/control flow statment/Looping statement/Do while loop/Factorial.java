// 15. Factorial of a number

import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		//int i =  1;
		int fact = 1;
		do {
			fact = fact * num;
			//i++;
			
			num--;
		}while(num > 0);
		System.out.println(fact);
	}
}
		