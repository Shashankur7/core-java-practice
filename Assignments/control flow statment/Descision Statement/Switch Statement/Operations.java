//1. Perform operation 1)Addition 2)Substraction 3)Multiplication 4)Division 5)Modulus 

import java.util.Scanner;
	
class Operations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :  \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Modulus");
		int choice = sc.nextInt();
		
		System.out.println("Enter 1 num");
		int num1 = sc.nextInt();
		System.out.println("Enter 2 num ");
		int num2 = sc.nextInt();
		
		switch(choice){
		case 1 :
			System.out.println("Addition is :" +(num1 + num2));
			break;
		
		case 2 :
			System.out.println("Substraction is :" +(num1 - num2));
			break;
			
		case 3 :
			System.out.println("Multiplication is :" +(num1*num2));
			break;
		
		case 4 :
			System.out.println("Division is :" +(num1/num2));
			break;
		
		case 5 :
			System.out.println("Modulus is : " + (num1%num2));
			break;
		
		default :
			System.out.println("invalid value");
		}
	}
}