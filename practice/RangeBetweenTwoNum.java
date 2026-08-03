

import java.util.Scanner;
class RangeBetweenTwoNum{

	public static void main (String [] atgs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : " );
		int num = sc.nextInt();
		String res = (num >= 10 && num <= 50  ) ? "In Range " : " out of the range";
		System.out.println(res);
	}
}
		