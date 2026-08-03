// 22) WAP to check given number is even or not, without using % operator

import java.util.Scanner;
class EvenOddWithoudMod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		int num = sc.nextInt();
		
		if (num / 2 * 2 == num )
		System.out.println("even");
		else
		System.out.println("odd");
	}
}
