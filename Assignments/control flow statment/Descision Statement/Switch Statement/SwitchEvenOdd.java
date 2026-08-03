//5)Write a program to perform even and odd operation using switch 

import java.util.Scanner;
class SwitchEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		switch(num%2){
			case 0:
				System.out.println( "num is even");
				break;
			
			case 1:
				System.out.println( "num is odd");
				break;
		}
	}
}