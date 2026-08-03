// 18) Check if character is binary digit

import java.util.Scanner;
class BinaryDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char ");
		char ch = sc.next().charAt(0);
	
		if (ch == '0' || ch == '1')
		System.out.println("Binary digit ");
		else 
		System.out.println("not binary");
	}
}
