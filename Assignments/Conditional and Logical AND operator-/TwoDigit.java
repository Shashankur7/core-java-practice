/*

class TwoDigit{
	public static void main(String [] args){
		int num = 45 ;
		String res =(num >= 10 && num <= 99) ? "Two Digit " : " Not Two Digit " ;
		System.out.println(res);
	}
}

*/

import java.util.Scanner;
class TwoDigit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num = sc.nextInt();
		String res = (num >= 10 && num <=99) ? "two digit " : " not Two Digit " ;
		System.out.println(res);
	}
}