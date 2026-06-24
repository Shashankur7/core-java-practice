// 29. WAP to print only sum of even factors in a given number

import java.util.Scanner;
class SumofEvenFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();

		int sum = 0;
		int even = 0;
		for (int i = 1; i <= num ; i++){
			if (num % i == 0){
				//sum = sum + i;
		
			if (i % 2 == 0){
				even = even + i;
				}
			}
		}
			System.out.println(even);
	}
}
			
				