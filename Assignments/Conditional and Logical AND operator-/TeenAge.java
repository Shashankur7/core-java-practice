// 11

import java.util.Scanner;
class TeenAge{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age ;");
		int age = sc.nextInt();
		String res = (age >= 13 && age <= 19 ) ? " Teen age " : " Not teen age " ;
		System.out.println(res);
	}
}

