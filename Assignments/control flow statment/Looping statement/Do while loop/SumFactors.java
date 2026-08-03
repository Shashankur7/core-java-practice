// 28. WAP to print factors sum of given number

import java.util.Scanner;
class SumFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int sum = 0;
		int i = 1;
		do {
			if(num % i == 0){
				sum = sum + i;
			}
		i++;
		}while(i <= num);
		System.out.println(sum);
	}
}
		