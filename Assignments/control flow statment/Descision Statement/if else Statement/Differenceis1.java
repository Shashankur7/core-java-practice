// 11) Check if difference of two numbers is exactly 1


import java.util.Scanner;

class  Differenceis1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		
		if (num1 - num2 == 1 || num2 - num1 == 1)
		System.out.println("Difference is exact 1");
		else
		System.out.println("Difference is not equal");
	}
}