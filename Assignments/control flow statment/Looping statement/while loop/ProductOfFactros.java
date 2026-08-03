// 32. WAP to print product of factors in a given number

import java.util.Scanner;
class ProductOfFactros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num :");
		int num = sc.nextInt();
	
		int pro = 1;
		int i = 1;
		while(i <= num){
			if (num % i == 0){
				pro = pro * i;
			}
			i++;
		}
		System.out.println(pro);
	}
}
			