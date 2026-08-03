// 29. WAP to print only sum of even factors in a given number

import java.util.Scanner;
class EvenSumOfFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num ){	
			if(num % i == 0){
				if(i % 2 == 0){
					sum = sum + i;
				}
			}
		i++;
		}
		System.out.println(sum);
	}
}