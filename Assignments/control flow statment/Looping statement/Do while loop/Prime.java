// 20. Prime numbers

import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		boolean flag = false;
		int fact = 0;
		int count = 0;
		int i = 1;
		do{
			if(num % i == 0){
				count++;
			}
			i++;
		}while(i <= num);
		if(count == 2){
			flag = true;
		}
		if(flag)
			System.out.println("prime NUM ");
		else
			System.out.println("not prime ");
	}
}