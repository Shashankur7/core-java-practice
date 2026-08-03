// 10

import java.util.Scanner;
class WorkinDay{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day :");
		int day = sc.nextInt();
		String res = (day >= 1 && day <= 5 ) ? "Working day " : "Not Working Day";
		System.out.println(res);
	}
}