// 31. WAP to check given number is perfect square or not

import java.util.Scanner;
class PerfectSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int i = 1;
		boolean flag = false;
		int squ = 1;
		do{
			if( i * i == num){
				flag = true;
				break;
			}
				
			i++;
		}while(i <= num);
			if(flag){
				System.out.println("perfect sqr");
			}
			else{
				System.out.println("not Perfect Sqr");
			}

	}
}