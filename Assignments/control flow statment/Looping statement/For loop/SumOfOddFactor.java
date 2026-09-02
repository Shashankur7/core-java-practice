// 30. WAP to print only sum of odd factors in a given number

import java.util.Scanner;
class SumOfOddFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();

		int odd = 0;
		for (int i = 1; i <= num ; i++){
			if (num % i == 0){
		   	System.out.println(i);		
			if (i % 2 != 0){
				odd = odd + i;
				}
			}
		}
			System.out.println(odd);
	}
}
