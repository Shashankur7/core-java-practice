// 32. WAP to print product of factors in a given number

import java.util.Scanner;
class ProductOfFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
		
		int pro = 1;
		for(int i = 1 ; i <= num ; i++){
			if(num % i == 0)
			pro = pro * i;
		}
		System.out.println(pro);
	}
}