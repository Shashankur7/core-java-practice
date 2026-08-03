// 31. WAP to check given number is perfect square or not

import java.util.Scanner;
class PerfectSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		boolean flag = false;

		int i = 1;
		while(i <= num){
			if ( i * i == num){
				
				flag = true;
				break;
			}
			
			i++;
		}
		if (flag == true )
			System.out.println(num+ ": perfect square ");
		else
			System.out.println("not Perfect num");
	}
		
}