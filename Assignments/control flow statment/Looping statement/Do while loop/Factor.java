// 27. WAP to print factors of given number

import java.util.Scanner;
class Factor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

	
		int i = 1;
		do{
			if(num % i == 0){
				System.out.println(i);
			}
		i++;
		}while(i <= num);
	}
}