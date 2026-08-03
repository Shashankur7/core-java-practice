// 10) ATM withdrawal: insufficient balance

import java.util.Scanner;

class AtmWithdrawal{
	public static void main(String[] args){

		int balance = 10000;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount :");
		int num = sc.nextInt();
		
		if (num > balance)
		System.out.println("insufficient balance");
		else
		System.out.println("have balance");
	}
}